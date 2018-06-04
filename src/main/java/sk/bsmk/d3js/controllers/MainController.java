package sk.bsmk.d3js.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/api/data", method = RequestMethod.GET, produces = "application/json")
    public String data() {
        return "[{" +
                "    \"nombre\": \"Alemania\"," +
                "    \"salarioMedio\": \"45952\"" +
                "}, {" +
                "    \"nombre\": \"Austria\"," +
                "    \"salarioMedio\": \"42573\"" +
                "}, {" +
                "    \"nombre\": \"Bulgaria\"," +
                "    \"salarioMedio\": \"5080\"" +
                "}, {" +
                "    \"nombre\": \"BÃ©lgica\"," +
                "    \"salarioMedio\": \"46464\"" +
                "}, {" +
                "    \"nombre\": \"Chipre\"," +
                "    \"salarioMedio\": \"22337\"" +
                "}, {" +
                "    \"nombre\": \"Croacia\"," +
                "    \"salarioMedio\": \"12232\"" +
                "}, {" +
                "    \"nombre\": \"Dinamarca\"," +
                "    \"salarioMedio\": \"53319\"" +
                "}, {" +
                "    \"nombre\": \"Eslovaquia\"," +
                "    \"salarioMedio\": \"10342\"" +
                "}, {" +
                "    \"nombre\": \"Eslovenia\"," +
                "    \"salarioMedio\": \"17851\"" +
                "}, {" +
                "    \"nombre\": \"EspaÃ±a\"," +
                "    \"salarioMedio\": \"26162\"" +
                "}, {" +
                "    \"nombre\": \"Estonia\"," +
                "    \"salarioMedio\": \"12436\"" +
                "}, {" +
                "    \"nombre\": \"Finlandia\"," +
                "    \"salarioMedio\": \"42910\"" +
                "}, {" +
                "    \"nombre\": \"Francia\"," +
                "    \"salarioMedio\": \"37427\"" +
                "}, {" +
                "    \"nombre\": \"Grecia\"," +
                "    \"salarioMedio\": \"20168\"" +
                "}, {" +
                "    \"nombre\": \"Holanda\"," +
                "    \"salarioMedio\": \"48856\"" +
                "}, {" +
                "    \"nombre\": \"HungrÃ\u00ADa\"," +
                "    \"salarioMedio\": \"9748\"" +
                "}, {" +
                "    \"nombre\": \"Irlanda\"," +
                "    \"salarioMedio\": \"34466\"" +
                "}, {" +
                "    \"nombre\": \"Islandia\"," +
                "    \"salarioMedio\": \"44210\"" +
                "}, {" +
                "    \"nombre\": \"Italia\"," +
                "    \"salarioMedio\": \"30463\"" +
                "}, {" +
                "    \"nombre\": \"Letonia\"," +
                "    \"salarioMedio\": \"9830\"" +
                "}, {" +
                "    \"nombre\": \"Lituania\"," +
                "    \"salarioMedio\": \"8116\"" +
                "}, {" +
                "    \"nombre\": \"Luxemburgo\"," +
                "    \"salarioMedio\": \"54560\"" +
                "}, {" +
                "    \"nombre\": \"Malta\"," +
                "    \"salarioMedio\": \"20500\"" +
                "}, {" +
                "    \"nombre\": \"Noruega\"," +
                "    \"salarioMedio\": \"64922\"" +
                "}, {" +
                "    \"nombre\": \"Polonia\"," +
                "    \"salarioMedio\": \"10124\"" +
                "}, {" +
                "    \"nombre\": \"Portugal\"," +
                "    \"salarioMedio\": \"17436\"" +
                "}, {" +
                "    \"nombre\": \"Reino Unido\"," +
                "    \"salarioMedio\": \"44203\"" +
                "}, {" +
                "    \"nombre\": \"RepÃºblica Checa\"," +
                "    \"salarioMedio\": \"11334\"" +
                "}, {" +
                "    \"nombre\": \"RumanÃ\u00ADa\"," +
                "    \"salarioMedio\": \"6222\"" +
                "}, {" +
                "    \"nombre\": \"Suecia\"," +
                "    \"salarioMedio\": \"44840\"" +
                "}, {" +
                "    \"nombre\": \"Suiza\"," +
                "    \"salarioMedio\": \"74528\"" +
                "}]";
    }

}
