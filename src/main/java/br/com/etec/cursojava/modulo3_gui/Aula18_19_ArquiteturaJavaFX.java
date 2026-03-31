package br.com.etec.cursojava.modulo3_gui;

public class Aula18_19_ArquiteturaJavaFX {
    public static void executar() {
        System.out.println("--- Aula 18 e 19: Migração para JavaFX (Arquitetura) ---");
        System.out.println("Exemplo Real: Explicando a diferença de processamento assíncrono entre Swing (AWT) e o motor moderno de renderização do JavaFX, através do modelo Palco e Cena.");
        System.out.println("Obs: O setup de dependências maven do 'javafx-controls' deve ocorrer nesta aula.");
        
        // Para usar JavaFX puro, a classe precisaria estender Application.
        // Simulamos o conceito aqui.
        /*
         public class HelloFX extends Application {
            @Override
            public void start(Stage stage) {
                String javaVersion = System.getProperty("java.version");
                String javafxVersion = System.getProperty("javafx.version");
                Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
                Scene scene = new Scene(new StackPane(l), 640, 480);
                stage.setScene(scene);
                stage.show();
            }
        }
        */
    }
}
