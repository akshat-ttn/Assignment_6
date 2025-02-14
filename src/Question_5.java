public class Question_5 {
    public static void main(String[] args) {

//        String name = "Akshat ";
//        System.out.println("repeat()_________"+name.repeat(3));
//
//        name = "\u2005 Akshat";
//        System.out.println("trim()___________"+name.trim());
//        System.out.println("strip()__________"+name.strip());
//
//        name = "  \u2004";
//        System.out.println("isBlank()________"+name.isBlank());
//
//        name = "Akshat";
//
//        System.out.print("indent()_________"+name.indent(10));
//        System.out.println("transform()______"+name.concat(" Srivastava"));




//        String raw = "To\\nThe\\tNew";
//        System.out.println(raw.translateEscapes());
//
//        String address = """
//                    221 Baker Street,
//                    London,
//                    England
//                    """;
//        System.out.println("___________________________________________________");
//        System.out.println(address);
//
//        System.out.println("___________________________________________________");
//
//        String name = "Sherlok Holmes";
//        System.out.println("%s\n%s".formatted(name,address));


        String yaml =
                        "\tname: Akshat\n" +
                        "\tage: 22\n" +
                        "\tskills:\n" +
                        "\t\t- Java\n" +
                        "\t\t- Spring Boot\n" +
                        "\t\t- Docker";

        System.out.println("Original YAML:\n----------------\n" + yaml);
        System.out.println("___________________________________________________");
        System.out.println("\nStripped YAML:\n----------------\n" + yaml.stripIndent());





    }
}
