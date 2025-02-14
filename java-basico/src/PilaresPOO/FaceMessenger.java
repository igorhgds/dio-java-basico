package PilaresPOO;

public class FaceMessenger extends ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo facebook");
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook");
    }
}
