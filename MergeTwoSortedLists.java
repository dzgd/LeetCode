package com.qf.day01;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/23-03-23-14:17
 * @description：合并两个有序链表
 * @version: 1.0
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l = new ListNode(0);
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        System.out.println(l1.val+""+l1.next.val+l1.next.next.val);
        MergeTwoSortedLists mt = new MergeTwoSortedLists();
        ListNode res = mt.mergeTwoLists(l1, l2);
        System.out.println(res.val + ""+ res.next.val+res.next.next.val+res.next.next.next.val+res.next.next.next.next.val+res.next.next.next.next.next.val);
        ListNode res2 = mt.mergeTwoListss(l1, l2);
        System.out.println(res2.val+""+res2.next.val+res2.next.next.val+res2.next.next.next.val+res2.next.next.next.next.val+res2.next.next.next.next.next.val);
    }
    //迭代法
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null){
            cur.next = l2;
        }
        if (l2 == null){
            cur.next = l1;
        }
        return res.next;
    }


    //recursion 递归法(深度遍历)
//    public ListNode mergeTwoListsWays(ListNode l1,ListNode l2){
//        if (l1 == null || l2 == null){
//            return l1 == null ? l2 : l1;
//        }
//        if (l1.val <= l2.val){
//            l1.next = mergeTwoListsWays(l1.next , l2);
//            return l1;
//        }else{
//            l2.next = mergeTwoListsWays(l1 , l2.next);
//            return l2;
//        }
//    }

    //
    // 递归实现
    public ListNode mergeTwoListss(ListNode l1, ListNode l2) {
        ListNode res = null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val <= l2.val) {
            res = l1;
            l1.next = mergeTwoListss(l1.next, l2);
        } else {
            res = l2;
            l2.next = mergeTwoListss(l1, l2.next);
        }
        return res;
    }



}
