function onLoad() {
  var svg = d3.select("svg");
  var circle = svg.selectAll("circle").data([32, 57, 112, 293, 13, 864]);
  var circleEnter = circle.enter().append("circle")

  circle.attr("r", function(d) { return Math.sqrt(d); });

  circleEnter.attr("cy", 60);
  circleEnter.attr("cx", function(d, i) { return i * 100 + 30; });
  circleEnter.attr("r", function(d) { return Math.sqrt(d); });

}