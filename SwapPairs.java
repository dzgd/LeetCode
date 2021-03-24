package com.qf.day01;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/23-03-23-19:56
 * @description：两两交换链表中的节点
 * @version: 1.0
 */
public class SwapPairs {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        SwapPairs sp = new SwapPairs();
        ListNode res = sp.swapPairs(l1);
        System.out.println(res.val+""+res.next.val+res.next.next.val+res.next.next.next.val);


    }

    //iteration迭代法
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode cur = res;
        while (cur.next != null && cur.next.next != null){
            ListNode next = head.next;
            ListNode tmp = head.next.next;
            cur.next = next;
            next.next = head;
            head.next = tmp;
            cur = head;
            head = head.next;
        }
        return res.next;
    }
}
