package exam03;

import java.util.ArrayList;

/*  
3. �Խ���(Board) Ŭ���� �ۼ�
�ش� ��Ű�� : exam03
 ���� Ŭ������(main �Լ� ����) : BoardExam
�Ϲ� Ŭ������ : Board
��� �ʵ� : �۹�ȣ(bno), ����(title), �ۼ���(uname), �۳���(content), �ۼ���
(resdate), ����Ƚ��(visited) 
�� ��� �ʵ�� ���� ������ ���� �ʵ��� �ؾ� �ϸ�, ������ ������ Ÿ���� ����
�Ͽ� ���� ������ �� �� �ֵ��� �� ���̸�,
�׿� ���� getter/setter ���� �ۼ��ϰ�, �⺻ �����ڿ� ��� ��� �ʵ� ���� ��
�������� �޴� �����ڸ� �ۼ��Ͻÿ�.
���� Ŭ�������� 6���� ���� �����ǰ�, �̸� ArrayList �Ǵ� �迭�� �����Ͽ� ��
���ϸ�, 
�ݵ��, 6���� ���� ��� ��� ȭ��(�ܼ� â)�� ������� ��µ� �� �ֵ��� �� 
��.
(board ��ü�� �� ��� �ʵ� ���� ���Ƿ� setter �� �����ϵ�, Ű����� �Է¹޵�
�������.)
 */
public class BoardExam {
    public static void main(String[] args) {
    	
    	Board BoardExam = new Board();
    	BoardExam.setContent(null);
    	BoardExam.setBno(0);
    	BoardExam.setUname(null);
    	BoardExam.getResdate();
    	
    	ArrayList<Board> board_list = new ArrayList<>();
    	
	

	

    }
}