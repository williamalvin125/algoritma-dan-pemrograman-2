package tugasbesar;

// MainPage.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame {
    private JPanel mainPanel;
    private JScrollPane scrollPane;
    private JPanel leftPanel;
    private JPanel rightPanel;

    public MainPage() {
        setTitle("Main Page");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2)); // One row, two columns

        leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        scrollPane = new JScrollPane(mainPanel);

        // Sample articles with image paths
        Article[] articles = {
            new Article("Article 1", "This is the content of Article 1", "images/image1.jpg"),
            new Article("Article 2", "This is the content of Article 2", "images/image2.jpg"),
            new Article("Article 3", "This is the content of Article 3", "images/image3.jpg"),
            new Article("Article 4", "This is the content of Article 4", "images/image4.jpg"),
            new Article("Article 5", "This is the content of Article 5", "images/image5.jpg"),
            new Article("Article 6", "This is the content of Article 6", "images/image6.jpg"),
            new Article("Article 7", "This is the content of Article 7", "images/image7.jpg"),
            new Article("Article 8", "This is the content of Article 8", "images/image8.jpg"),
            new Article("Article 9", "This is the content of Article 9", "images/image9.jpg"),
            new Article("Article 10", "This is the content of Article 10", "images/image10.jpg")
        };

        for (int i = 0; i < articles.length; i++) {
            if (i < 5) {
                addArticlePanel(leftPanel, articles[i]);
            } else {
                addArticlePanel(rightPanel, articles[i]);
            }
        }

        add(scrollPane);
    }

    private void addArticlePanel(JPanel parentPanel, Article article) {
        JPanel articlePanel = new JPanel();
        articlePanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel(article.getTitle());
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon(article.getImagePath());
        imageLabel.setIcon(imageIcon);

        JButton readMoreButton = new JButton("Read More");
        readMoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ArticlePage(MainPage.this, article).setVisible(true);
                MainPage.this.setVisible(false);
            }
        });

        articlePanel.add(titleLabel, BorderLayout.NORTH);
        articlePanel.add(imageLabel, BorderLayout.CENTER);
        articlePanel.add(readMoreButton, BorderLayout.SOUTH);

        parentPanel.add(articlePanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainPage().setVisible(true);
        });
    }
}
