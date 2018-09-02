package DTO;

import enums.AppointStateEnum;

public class AppointResult {
		// ͼ��ID
		private long bookId;
		
		private long studentId;

		// ԤԼ���״̬
		private int state;

		// ״̬��ʶ
		private String stateInfo;  

		public AppointResult() {
		}
 
		// ԤԼ����Ĺ�����
		public AppointResult(long bookId, long studentId, AppointStateEnum stateEnum) {
			this.bookId = bookId;
			this.studentId = studentId;
			this.state = stateEnum.getState();
			this.stateInfo = stateEnum.getStateInfo();
		}

		//set get ������
		public long getBookId() {
			return bookId;
		}

		public void setBookId(long bookId) {
			this.bookId = bookId;
		}

		public int getState() {
			return state;
		}

		public void setState(int state) {
			this.state = state;
		}

		public String getStateInfo() {
			return stateInfo;
		}

		public void setStateInfo(String stateInfo) {
			this.stateInfo = stateInfo;
		}
		
		public long getStudentId() {
			return studentId;
		}

		public void setStudentId(long studentId) {
			this.studentId = studentId;
		}

		@Override
		public String toString() {
			return "AppointResult [bookId=" + bookId + ", studentId=" + studentId + ", state=" + state + ", stateInfo="
					+ stateInfo + "]";
		}

		
}
