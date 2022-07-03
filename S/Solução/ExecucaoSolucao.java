package S.Solução;

public class ExecucaoSolucao {

    public static void execute(){
        LoginPage loginPage = new LoginPage();

        loginPage.acessar();
        loginPage.logar();

        MenuPage menuPage = new MenuPage();
        menuPage.acessarMenuUsuario();

        UsuarioPage usuarioPage = new UsuarioPage();
        usuarioPage.cadastrarUsuario();
    }
    
}
