var config = {columnWidth: 20, columnHeight: 235, columnGap: 5, padding: 100};

var ES_es = d3.locale({
    "decimal": ",",
    "thousands": ".",
    "grouping": [3],
    "currency": ["", " €"],
    "dateTime": "%a %b %e %X %Y",
    "date": "%d/%m/%Y",
    "time": "%H:%M:%S",
    "periods": ["AM", "PM"],
    "days": ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"],
    "shortDays": ["Dom", "Lun", "Mar", "Mi", "Jue", "Vie", "Sab"],
    "months": ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"],
    "shortMonths": ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"]
});

var _format = ES_es.numberFormat("$,0f");

function renderData(datos) {
    var NUM_COLUMNAS = datos.length;
    config.width = NUM_COLUMNAS * (config.columnWidth + config.columnGap) + (2 * config.padding);
    config.height = config.columnHeight + 2 * config.padding;

    var SALARIO_MAX = d3.max(datos, function (d) {
        return +d.salarioMedio;
    });

    var x = d3.scale.ordinal()
        .rangeRoundBands([0, config.width - 2 * config.padding])
        .domain(datos.map(function (d) {
            return d.nombre;
        }));

    var y = d3.scale.linear()
        .range([0, config.columnHeight])
        .domain([0, SALARIO_MAX]);

    var rangeY = d3.scale.linear()
        .range([config.columnHeight, 0])
        .domain([0, SALARIO_MAX]);


    var ejeX = d3.svg.axis()
        .scale(x)
        .orient("bottom");

    var ejeY = d3.svg.axis()
        .scale(rangeY)
        .tickFormat(_format)
        .orient("left");

    var tooltip = d3.tip()
        .attr('class', 'tooltip')
        .offset([-10, 0])
        .html(function (d) {
            return "<strong>" + d.nombre + "</strong><br> salario medio: " + _format(+d.salarioMedio);
        });

    var svg = d3.select("svg")
        .attr("width", config.width)
        .attr("height", config.height);

    svg.call(tooltip);

    svg.append("g")
        .attr("class", "eje")
        .attr("transform", "translate(" + config.padding + "," + (10 + config.padding + config.columnHeight) + ")")
        .call(ejeX)
        .selectAll("text")
        .attr("transform", "rotate(90)")
        .attr("x", "10")
        .attr("y", "-3")
        .style("text-anchor", "start");


    svg.append("g")
        .attr("class", "eje")
        .attr("transform", "translate(" + (config.padding - 10) + "," + config.padding + ")")
        .call(ejeY);

    svg.selectAll("rect")
        .data(datos)
        .enter().append("rect")
        .attr("width", config.columnWidth)
        .attr("x", function (d, i) {
            return config.padding + x(d.nombre)
        })
        .attr("y", function (d, i) {
            return config.padding + config.columnHeight - y(d.salarioMedio)
        })
        .attr("height", function (d, i) {
            return y(d.salarioMedio)
        })
        .attr("data-nombre", function (d, i) {
            return d.nombre
        })
        .attr("data-salarioMerdio", function (d, i) {
            return _format(+d.salarioMedio)
        })
        .on('mouseover', tooltip.show)
        .on('mouseout', tooltip.hide)

}

$(document).ready(function () {
    refresh();
});

function refresh() {
    $.ajax({
        url: "/api/data",
        success: function (data) {
            renderData(data);
        }
    });
}