import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;

class Ed08 {

	public class REQ01CT01_CadastroLivroComSucesso{
		private WebDriver driver;
			@Before
			public void setUp(){
				driver = new ChromeDriver();
				driver.get = ("http://www.taketest.com.br/");
				driver.manager().window().maximize();
			}
			
			@Test
			public void inserirLivro()
			{
				WebElement livro = driver.findElement(By.id("livro"));
				livro.isbn.add(1234);
				livro.autor.add("Fulano da Silva");
				livro.titulo.add("Teste1");
			}
			
			@Test
			public void atualizarPagina()
			{
				driver.navigate().refresh();
			}
		
			@After
			public void fecharPagina()
			{
				driver.quit();
			}
		}
		
	public class REQ01CT02_AlterarLivroComSucesso{
		private WebDriver driver;
			@Before
			public void setUp(){
				driver = new ChromeDriver();
				driver.get = ("http://www.taketest.com.br/");
				driver.manager().window().maximize();
			}
			
			@Test
			public void inserirLivro()
			{
				WebElement livro = driver.findElement(By.livro.isbn("1234"));
				livro.autor.add("Fulano dos Santos");
				livro.titulo.add("Teste2");
			}
			
			@Test
			public void atualizarPagina()
			{
				driver.navigate().refresh();
			}
		
			@After
			public void fecharPagina()
			{
				driver.quit();
			}
		}
	
	public class REQ01CT03_ConsultaLivroComSucesso{
		private WebDriver driver;
			@Before
			public void setUp(){
				driver = new ChromeDriver();
				driver.get = ("http://www.taketest.com.br/");
				driver.manager().window().maximize();
			}
			
			@Test
			public void consultarLivro()
			{
				WebElement livro = driver.findElement(By.id("livro"));
				livro.isbn.add(1234);
			}
			
			@Test
			public void atualizarPagina()
			{
				driver.navigate().refresh();
			}
		
			@After
			public void fecharPagina()
			{
				driver.quit();
			}
		}
	
	public class REQ01CT03_ConsultaLivroComSucesso{
		private WebDriver driver;
			@Before
			public void setUp(){
				driver = new ChromeDriver();
				driver.get = ("http://www.taketest.com.br/");
				driver.manager().window().maximize();
			}
			
			@Test
			public void excluirLivro()
			{
				WebElement livro = driver.findElement(By.id("livro"));
				livro.isbn.add(1234);
			}
			
			@Test
			public void atualizarPagina()
			{
				driver.navigate().refresh();
			}
		
			@After
			public void fecharPagina()
			{
				driver.quit();
			}
		}
}
