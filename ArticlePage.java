package tugasbesar;

// ArticlePage.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArticlePage extends JFrame {
    private Article article;

    public ArticlePage(JFrame parent, Article article) {
        this.article = article;
        setTitle(article.getTitle());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(parent);

        JPanel articlePanel = new JPanel();
        articlePanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel(article.getTitle());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        
        JTextArea contentArea = new JTextArea(article.getContent());
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        contentArea.setEditable(false);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(true);
                ArticlePage.this.dispose();
            }
        });

        articlePanel.add(titleLabel, BorderLayout.NORTH);
        articlePanel.add(new JScrollPane(contentArea), BorderLayout.CENTER);
        articlePanel.add(backButton, BorderLayout.SOUTH);

        add(articlePanel);
    }
}
