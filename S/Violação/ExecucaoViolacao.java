package S.Violação;

public class ExecucaoViolacao {

    public static void execute(){

        LoginPage loginPage = new LoginPage();

        loginPage.acessar();
        loginPage.logar();
        loginPage.acessarMenuUsuario();
        loginPage.cadastrarUsuario();
    }
          
}
