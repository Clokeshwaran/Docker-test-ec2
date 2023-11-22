package com.dockertestec2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetApi {


@GetMapping("/get")
    public String getAllUsersDataTable() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Test Page</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            margin: 20px;\n" +
                "        }\n" +
                "        header {\n" +
                "            text-align: center;\n" +
                "            background-color: #f0f0f0;\n" +
                "            padding: 10px;\n" +
                "        }\n" +
                "        main {\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "        footer {\n" +
                "            text-align: center;\n" +
                "            background-color: #f0f0f0;\n" +
                "            padding: 10px;\n" +
                "            position: fixed;\n" +
                "            bottom: 0;\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <header>\n" +
                "        <h1>Welcome to the Test Page</h1>\n" +
                "    </header>\n" +
                "\n" +
                "    <main>\n" +
                "        <p>This is a simple HTML page for testing purposes.</p>\n" +
                "        <p>Feel free to modify and experiment with the content.</p>\n" +
                "    </main>\n" +
                "\n" +
                "    <footer>\n" +
                "        <p>&copy; 2023 Test Page. All rights reserved.</p>\n" +
                "    </footer>\n" +
                "</body>\n" +
                "</html>\n";
    }
}
