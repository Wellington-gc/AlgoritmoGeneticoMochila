public class Principal {

    public static void main(String[] args) {

        Objeto[] objetos = {
            new Objeto(9, 4, "Corda de escalada"),
            new Objeto(8, 1, "Capacete"),
            new Objeto(5, 1, "Cadeirinha"),
            new Objeto(5, 3, "Fitas tubulares"),
            new Objeto(7, 3, "Cordeletes"),
            new Objeto(4, 2, "Mosquetões com rosca"),
            new Objeto(3, 2, "Mosquetões simples"),
            new Objeto(9, 2, "Costuras"),
            new Objeto(5, 3, "Freios de segurança"),
            new Objeto(4, 1, "Cantil"),
            new Objeto(8, 1, "Lanterna de cabeça"),
            new Objeto(8, 1, "Lanterna"),
            new Objeto(2, 1, "Pilhas e lâmpadas reserva"),
            new Objeto(3, 2, "Roupa impermeavel"),
            new Objeto(8, 1, "Carteira de identificacao"),
            new Objeto(7, 2, "Kit primeiros socorros"),
            new Objeto(1, 2, "Camara fotografica com filme")
        };
        
        Mochila mochila = new Mochila(20, objetos, 50, 100);
        Cromossomo melhor = mochila.executar();
        String sMelhor = melhor.toString();

        
        System.out.println("Melhor: "+melhor.toString());
        System.out.println("Peso Total: "+melhor.getPesoTotal());
        System.out.println("Soma Beneficio: "+melhor.avaliacao());

        for(int i = 0; i < objetos.length; i++) {
            if (sMelhor.charAt(i) == '1') {
                System.out.println(objetos[i].getNome());
            }
        }
    }
}
