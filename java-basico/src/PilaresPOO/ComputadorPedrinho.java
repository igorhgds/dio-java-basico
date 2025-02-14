package PilaresPOO;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFACEBOOK");
        FaceMessenger face = new FaceMessenger();
        face.enviarMensagem();
        face.receberMensagem();

        System.out.println("\nTELEGRAM");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
