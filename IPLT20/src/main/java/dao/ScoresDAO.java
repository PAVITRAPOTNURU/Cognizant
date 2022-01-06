package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Enity.Scores;
import Util.DBUtil;

public class ScoresDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Scores> displayScores() {
		// TODO Auto-generated method stub
		List<Scores> l1=new ArrayList<Scores>();
		try
		{
			Connection con=DBUtil.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from scores");
			while(rs.next())
			{
				Scores s=new Scores();
				s.setPlayerName(rs.getString("playerName"));
				s.setRunsScored(rs.getInt("runsScored"));
				s.setBallsFaced(rs.getInt("ballsFaced"));
				l1.add(s);
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return l1;
	}

}
