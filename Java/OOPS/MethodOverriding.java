/*
Complete the code in your editor by writing an overridden getNumberOfTeamMembers
method that prints the same statement as the superclass' getNumberOfTeamMembers method,
except that it replaces n with 11(the number of players on a Soccer team).

Output Format
When executed, your completed code should print the following:

Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
*/
package oops;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }

void get_number_of_team_members(){
    System.out.println("Each team has 11 players in Soccer Class");
}
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}