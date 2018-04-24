import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class StoredProcedures{

	static Connection con;

	public static void go(){
		try {
			con = DriverManager.getConnection("jdbc:sqlserver://Data Source=(localdb)\MSSQLLocalDB;databaseName=AnimalAdoption;user=franklm;password=thisispassword");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	public static void spGetAdoptionsByAnimalID(String AnimalID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spGetAdoptionsByAnimalID(?)}");
		statement.setString(1, AnimalID);
		runStatement(statement);
	}

	public static void spGetCenterByAnimalID(String AnimalID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spGetCenterByAnimalID(?)}");
		statement.setString(1, AnimalID);
		runStatement(statement);
	}

	public static void spGetCustomerInfoByName(String CustomerName) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spGetCustomerInfoByName(?)}");
		statement.setString(1, CustomerName);
		runStatement(statement);
	}

	public static void spListUnadoptedPets() throws SQLException {
		CallableStatement statement = con.prepareCall("{call spListUnadoptedPets()}");
		runStatement(statement);
	}

	public static void spSearchAnimalsBySpeciesName(String SpeciesName) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spSearchAnimalsBySpeciesName(?)}");
		statement.setString(1, SpeciesName);
		runStatement(statement);
	}

	public static void spSearchAnimalsByCenterID(String CenterID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spSearchAnimalsByCenterID(?)}");
		statement.setString(1, CenterID);
		runStatement(statement);
	}

	public static void spListAdoptionsByCustomer(String CustomerID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spListAdoptionsByCustomer(?)}");
		statement.setString(1, CustomerID);
		runStatement(statement);
	}

	public static void spGetEmployeeSalary(String EmployeeID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spGetEmployeeSalary(?)}");
		statement.setString(1, EmployeeID);
		runStatement(statement);
	}

	public static void spGetEmployeesByCenter(String CenterID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spGetEmployeesByCenter(?)}");
		statement.setString(1, CenterID);
		runStatement(statement);
	}

	public static void spGetAdoptionsByDate(String date1, String date2) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spGetAdoptionsByDate(?,?)}");
		statement.setString(1, date1);
		statement.setString(2, date2);
		runStatement(statement);
	}

	public static void spValidateCustomerPassword(String username, String password) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spValidateCustomerPassword(?,?)}");
		statement.setString(1, username);
		statement.setString(2, password);
		runStatement(statement);
	}

	public static void spValidateAdminPassword(String username, String password) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spValidateAdminPassword(?,?)}");
		statement.setString(1, username);
		statement.setString(2, password);
		runStatement(statement);
	}

	public static void spAddAdoptionCenter(String CenterName, String CenterAddress) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spAddAdoptionCenter(?,?)}");
		statement.setString(1, CenterName);
		statement.setString(2, CenterAddress);
		runStatement(statement);
	}

	public static void spAddAdoptions(String AnimalID, String CustomerID, String AdoptionCost, String AdoptionDate) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spAddAdoptions(?,?,?,?)}");
		statement.setString(1, AnimalID);
		statement.setString(2, CustomerID);
		statement.setString(3, AdoptionCost);
		statement.setString(4, AdoptionDate);
		runStatement(statement);
	}

	public static void spAddAnimals(String CenterID, String SpeciesID, String AnimalName, String AnimalAge, String AnimalSex, String Description, String DateArrived) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spAddAnimals(?,?,?,?,?,?,?)}");
		statement.setString(1, CenterID);
		statement.setString(2, SpeciesID);
		statement.setString(3, AnimalName);
		statement.setString(4, AnimalAge);
		statement.setString(5, AnimalSex);
		statement.setString(6, Description);
		statement.setString(7, DateArrived);
		runStatement(statement);
	}

	public static void spAddCustomer(String CustomerName, String CustomerAddress, String CustomerEmail) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spAddCustomer(?,?,?)}");
		statement.setString(1, CustomerName);
		statement.setString(2, CustomerAddress);
		statement.setString(3, CustomerEmail);
		runStatement(statement);
	}

	public static void spAddEmployee(String CenterID, String EmployeeName, String EmployeePhone, String EmployeeSalary, String Administrator) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spAddEmployee(?,?,?,?,?)}");
		statement.setString(1, CenterID);
		statement.setString(2, EmployeeName);
		statement.setString(3, EmployeePhone);
		statement.setString(4, EmployeeSalary);
		statement.setString(5, Administrator);
		runStatement(statement);
	}

	public static void spDeleteAdoptionCenter(String CenterID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spDeleteAdoptionCenter(?)}");
		statement.setString(1, CenterID);
		runStatement(statement);
	}

	public static void spDeleteAdoptions(String AdoptionID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spDeleteAdoptions(?)}");
		statement.setString(1, AdoptionID);
		runStatement(statement);
	}

	public static void spDeleteAnimal(String AnimalID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spDeleteAnimal(?)}");
		statement.setString(1, AnimalID);
		runStatement(statement);
	}

	public static void spDeleteCustomer(String CustomerID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spDeleteCustomer(?)}");
		statement.setString(1, CustomerID);
		runStatement(statement);
	}

	public static void spDeleteEmployee(String EmployeeID) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spDeleteEmployee(?)}");
		statement.setString(1, EmployeeID);
		runStatement(statement);
	}

	public static void spUpdateAdoptionCenter(String CenterID, String CenterName, String CenterAddress) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spUpdateAdoptionCenter(?,?,?)}");
		statement.setString(1, CenterID);
		statement.setString(2, CenterName);
		statement.setString(3, CenterAddress);
		runStatement(statement);
	}

	public static void spUpdateAdoptions(String AdoptionID, String AnimalID, String CustomerID, String AdoptionCost, String AdoptionDate) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spUpdateAdoptions(?,?,?,?,?)}");
		statement.setString(1, AdoptionID);
		statement.setString(2, AnimalID);
		statement.setString(3, CustomerID);
		statement.setString(4, AdoptionCost);
		statement.setString(5, AdoptionDate);
		runStatement(statement);
	}

	public static void spUpdateAnimals(String AnimalID, String CenterID, String SpeciesID, String AnimalName, String AnimalAge, String AnimalSex, String Description, String DateArrived) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spUpdateAnimals(?,?,?,?,?,?,?,?)}");
		statement.setString(1, AnimalID);
		statement.setString(2, CenterID);
		statement.setString(3, SpeciesID);
		statement.setString(4, AnimalName);
		statement.setString(5, AnimalAge);
		statement.setString(6, AnimalSex);
		statement.setString(7, Description);
		statement.setString(8, DateArrived);
		runStatement(statement);
	}

	public static void spUpdateCustomer(String CustomerID, String CustomerName, String CustomerAddress, String CustomerEmail) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spUpdateCustomer(?,?,?,?)}");
		statement.setString(1, CustomerID);
		statement.setString(2, CustomerName);
		statement.setString(3, CustomerAddress);
		statement.setString(4, CustomerEmail);
		runStatement(statement);
	}

	public static void spUpdateEmployee(String EmployeeID, String CenterID, String EmployeeName, String EmployeePhone, String EmployeeSalary, String Administrator) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spUpdateEmployee(?,?,?,?,?,?)}");
		statement.setString(1, EmployeeID);
		statement.setString(2, CenterID);
		statement.setString(3, EmployeeName);
		statement.setString(4, EmployeePhone);
		statement.setString(5, EmployeeSalary);
		statement.setString(6, Administrator);
		runStatement(statement);
	}

	public static void spUpdateSpecies(String SpeciesID, String SpeciesName) throws SQLException {
		CallableStatement statement = con.prepareCall("{call spUpdateSpecies(?,?)}");
		statement.setString(1, SpeciesID);
		statement.setString(2, SpeciesName);
		runStatement(statement);
	}


	public static void runStatement(CallableStatement statement) throws SQLException {
		boolean results = statement.execute();
		DisplayDataInterface ddi = new DisplayDataInterface();
		ResultSet rs = statement.getResultSet();


		if (results) {
			ResultSetMetaData metaData = rs.getMetaData();
			int columns = metaData.getColumnCount();

			for (int i = 1; i <= columns; i++) {
				ddi.display.append(metaData.getColumnName(i) + "\t");
			}
			ddi.display.append("\n");

			while (rs.next()) {
				for (int i = 1; i <= columns; i++) {
					if(rs.getString(i).length() > 15){
						ddi.display.append(rs.getString(i).substring(0,10) + "...\t");
					}else{
						ddi.display.append(rs.getString(i) + "\t");
					}
				}
				ddi.display.append("\n");
			}
		}
	}



}

