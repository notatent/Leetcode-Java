package com.inuker.test;

import com.inuker.solution.FindAllNumbersDisappearedInAnArray;
import com.inuker.solution.MinimumSizeSubarraySum;
import com.inuker.solution.NextPermutation;
import com.inuker.solution.SearchForARange;
import com.leetcode.library.ListNode;
import com.leetcode.library.RandomListNode;
import com.leetcode.library.TreeNode;
import com.leetcode.library.UndirectedGraphNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class main {

    public static void main(String[] args) {
        int[] arr = new int[]{
                4,3,2,7,8,2,3,1
        };
        for (int n : new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(arr)) {
            System.out.print(n + " ");
        }
    }
}
