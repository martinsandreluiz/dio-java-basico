public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();    // criando novo objeto e atribuindo à classe

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
            System.out.println("Atualizar status - TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Atualizar status - TV ligada? " + smartTv.ligada);

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);       

    }
}
