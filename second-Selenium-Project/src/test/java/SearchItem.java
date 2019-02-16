import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchItem extends TestBase{

    @BeforeClass
    public void isOnTheHomePage(){
        
    }
    @Test
    public void testSearchItem(){
        app.typeToTheSearchBar("box");
        app.startSearch();
    }



}
