package se.smu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;


public class TodolistList extends JPanel{
	private JTable TodoList_table;
	
	TodolistList(String [] subject) throws IOException{
		setBackground(Color.WHITE);
		setBounds(0, 0, 420, 480);
		setLayout(null);

		EtchedBorder eborder;
		eborder = new EtchedBorder(EtchedBorder.LOWERED);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 420, 480);
		add(panel);
		panel.setLayout(null);
		
		
		JLabel todo_label = new JLabel("To do list");
		todo_label.setFont(new Font("고딕체", Font.PLAIN, 30));
		todo_label.setHorizontalAlignment(SwingConstants.CENTER);
		todo_label.setBounds(120, 0, 159, 56);
		panel.add(todo_label);
		
		Object[][] column =	{
				{1,null,null},
				{2,null,null},
				{3,null,null},
				{4,null,null},
				{5,null,null},
				{6,null,null},
				{7,null,null},
				{8,null,null},
				{9,null,null},
				{10,null,null},
				{11,null,null},
				{12,null,null},
				{13,null,null},
				{14,null,null},
				{15,null,null},
				{16,null,null}
			};
	
		String[] row = {
			"", "할 일", "마감 기한"
		};
		
	
	
		TodoList_table= new JTable();		
		
		
		
		
		TodoList_table.setModel(new DefaultTableModel(column,row) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			/*
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			*/
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		TodoList_table.setBounds(0, 50, 418, 233);
		panel.add(TodoList_table);
		
		JScrollPane scrollPane = new JScrollPane(TodoList_table);
		scrollPane.setBounds(0, 50, 418, 233);
		scrollPane.setBackground(Color.WHITE);
		panel.add(scrollPane);
		
		TodoList_table.setRowHeight(42);
		TodoList_table.getColumnModel().getColumn(0).setMaxWidth(40);
		
		//등록
		JButton add = new JButton("");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
			
			}
		});
		add.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/todo_add.PNG")));
		add.setBorder(null);
		add.setBackground(Color.WHITE);
		add.setBounds(5, 341, 96, 48);
		panel.add(add);
		
		
		//수정
		JButton edit = new JButton("");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		
			
				
			}
		});
		edit.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/todo_edit.PNG")));
		edit.setBorder(null);
		edit.setBackground(Color.WHITE);
		edit.setBounds(104, 341, 96, 48);
		panel.add(edit);
		
		
		//삭제
		JButton del = new JButton("");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
	
				
			
				
			}
		});
		del.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/todo_del.PNG")));
		del.setBorder(null);
		del.setBackground(Color.WHITE);
		del.setBounds(203, 341, 96, 48);
		panel.add(del);
		
		
		//완료
		JButton done = new JButton("");
		done.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		
			
				
			}
		});
		done.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/todo_done.PNG")));
		done.setBorder(null);
		done.setBackground(Color.WHITE);
		done.setBounds(302, 341, 96, 48);
		panel.add(done);
		
		
	}


	
	

}
