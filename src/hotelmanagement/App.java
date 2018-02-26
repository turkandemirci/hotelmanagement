package hotelmanagement;



import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    //DAL dal=new DAL();
    //dal.getConnection();
    //dal.searchToStatus();
     /* dal.getConnection();
      System.out.println("enter number");
      Scanner input=new Scanner(System.in);
      int choice=input.nextInt();
      if(choice==1){
      dal.addingEmployee();
      }
      else{
      dal.addingGuest();*/
		 try
		  {
		  LoginGUI frame=new LoginGUI();
		 
		  frame.setVisible(true);
		  }
		  catch(Exception e)
		  {
			  JOptionPane.showMessageDialog(null, e.getMessage());
			  }
		  }
      }
      



