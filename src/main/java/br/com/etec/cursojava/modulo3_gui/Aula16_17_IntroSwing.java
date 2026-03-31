package br.com.etec.cursojava.modulo3_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula16_17_IntroSwing {
    
    public static void executar() {
        System.out.println("--- Aula 16 e 17: Introdução ao Swing (Componentes e Eventos) ---");
        System.out.println("Exemplo Real: O instrutor mostra como fazer uma janela com um botão que interage via Listener.");
        
        // Comentado para não abrir janela desnecessariamente ao ser listado, mas código pronto.
        /*
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Minha Primeira Tela Swing");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            
            JLabel lblMensagem = new JLabel("Clique no botão abaixo");
            JButton btnAcao = new JButton("Me Clique!");
            
            btnAcao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lblMensagem.setText("O evento foi disparado com sucesso!");
                }
            });
            
            frame.add(lblMensagem);
            frame.add(btnAcao);
            frame.setVisible(true);
        });
        */
    }
}
