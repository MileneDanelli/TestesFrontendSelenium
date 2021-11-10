package testes;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class ContatosTest {
    @Test
    void deve() {
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000/contatos");

        String expectedTitle = "Contatos";

        String TituloAtual = driver.findElement(By.id("title")).getText();

        assertTrue(TituloAtual.equalsIgnoreCase(expectedTitle),"Título não presente.");
    }
}
