package maven_adactin_Testcls_R;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import maven_adactin_Maincls_R.Maven_Main_Basic_class_R;
import maven_adactin_Maincls_R.Maven_Main_Pom_page1_R;
import maven_adactin_Maincls_R.Maven_Main_Pom_page2_R;
import maven_adactin_Maincls_R.Maven_Main_Pom_page3_R;
import maven_adactin_Maincls_R.Maven_Main_Pom_page4_R;
import maven_adactin_Maincls_R.Maven_Main_Pom_page5_R;
import maven_adactin_Maincls_R.Maven_Main_Pom_page6_R;
import maven_adactin_Maincls_R.Maven_Main_Pom_page7_R;






public class Maven_Running_Testclass_R extends Maven_Main_Basic_class_R { // basic class import agum

	
	public static WebDriver driver = launch();
	
	
	
	public static void main(String[] args) throws IOException {

		
// page1
		
		Maven_Main_Pom_page1_R obj1 = new Maven_Main_Pom_page1_R(driver); // imp give this syntax then pomclass 1 import agum
		
		maximize();
		
		url("https://adactinhotelapp.com/");
		
		userid(obj1.getUsername(), "gokulbala");
		
		passw(obj1.getPasswrd(), "gokulbalaji12345");
		
		click(obj1.getLogin());
		
		waits();
		
		
// page2
		
		
		Maven_Main_Pom_page2_R obj2 = new Maven_Main_Pom_page2_R(driver);
		
		selectbyindex(obj2.getLocatn(), 1);
		
		selectbyvalue(obj2.getHotls(), "Hotel Cornice");
		
		selectbyvisibletext(obj2.getRoomtyp(), "Deluxe");
		
		selectbyindex(obj2.getRoomnosss(), 1);
		
		clear(obj2.getDatepikk());
		
		sendkeys(obj2.getDatepikk(), "11/11/2022");
		
		clear(obj2.getDatepickoutt());
		
		sendkeys(obj2.getDatepickoutt(), "12/11/2022");
		
		selectbyindex(obj2.getAdultroomm(), 1);
		
		selectbyvisibletext(obj2.getChildroomm(), "0 - None");
		
		click(obj2.getSubmitt());
		
		waits();
		
		
// page3
		
		Maven_Main_Pom_page3_R obj3 = new Maven_Main_Pom_page3_R(driver);
		
		click(obj3.getRadiobuttonn());
		
		click(obj3.getContinuee());
		
		waits();
		
// page4
		
		Maven_Main_Pom_page4_R obj4 = new Maven_Main_Pom_page4_R(driver);
		
		sendkeys(obj4.getFirstnamee(), "gokul");
		
		sendkeys(obj4.getLastnamee(), "bala");
		
		sendkeys(obj4.getAdresss(), "no:48, sss street, chidambaram");
		
		sendkeys(obj4.getCcnumm(), "6789012345123456");
		
		selectbyvisibletext(obj4.getCctypee(), "American Express");
		
		selectbyvalue(obj4.getCcexpmnthh(), "10");
				
		selectbyvalue(obj4.getCcexpyrr(), "2022");
		
		sendkeys(obj4.getCvvv(), "786");
		
		click(obj4.getBooknoww());
		
		waits();
		
		
// page5
		
		Maven_Main_Pom_page5_R obj5 = new Maven_Main_Pom_page5_R(driver);
		
		click(obj5.getMyitryy());
		
		waits();
		
		
// page6
		
		
		Maven_Main_Pom_page6_R obj6 = new Maven_Main_Pom_page6_R(driver);
		
		click(obj6.getSelcncll());
		
		click(obj6.getCnclall());
		
		waits();
		
		alertaccept();
		
		screenshot("C:\\Users\\gokul\\eclipse-workspace\\Maven_Roughwork\\Screenshot\\cancell.png");
		
		
// page7
		
		
		Maven_Main_Pom_page7_R obj7 = new Maven_Main_Pom_page7_R(driver);
		
		click(obj7.getLogoutt());
		
		screenshot("C:\\Users\\gokul\\eclipse-workspace\\Maven_Roughwork\\Screenshot\\logout.png");
		
		
		
		
	}

}
