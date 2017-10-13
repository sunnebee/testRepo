import java.text.ParseException;

public class Test {
	
	public static void main(String[] args){
		
		long caculationMilli = 1000 * 60 * 5;//5분
		
		String  day = "20170918154931"; // SimpleDateFormat 생성자에 전달되는 형식과 일치해야 함
		try {
			java.util.Date d = new java.text.SimpleDateFormat("yyyyMMddHHmmss").parse(day);
			
			long milli = d.getTime();
			
			System.out.println("d:"+d);
			
			System.out.println("milli:"+milli);
			
			long currentMilli = System.currentTimeMillis();
			
			System.out.println("currentMilli:"+currentMilli);
			
			long compare = currentMilli - milli;//-가 나오면, 이상한상황임.
			
			System.out.println("compare:"+compare);
			
			if(caculationMilli>compare){
				
				System.out.println("5분 안지남~:"+compare);
			}else{
				
				System.out.println("5분 지남~"+compare);
			}
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
