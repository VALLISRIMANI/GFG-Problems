<h2><a href="https://www.geeksforgeeks.org/problems/total-cuts--170648/1">Total Cuts</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">You are given an array <strong>a[]</strong> of <strong>n</strong> integers and an integer <strong>k</strong>, find the total number of cuts that you can make such that for each cut these two conditions are satisfied</span></p>
<ul>
<li><span style="font-size: 18px;">A cut divides into two parts of non-zero lengths.&nbsp;</span></li>
<li><span style="font-size: 18px;">Sum of the largest in the left part and the smallest in the right part is greater than or equal to <strong>k</strong>.</span></li>
</ul>
<p><strong><span style="font-size: 18px;">Examples :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a[] = [1, 2, 3], k = 3</span>
<span style="font-size: 18px;"><strong>Output: </strong>2</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>Two ways in which array is divided to satisfy above conditions are:
[1] and [2, 3] -&gt; 1 + <span style="font-size: 14pt;">2 ≥ 3 (satisfies the condition)
[1,2] and [3] -&gt; 2 + 3 ≥ 3</span> (satisfies the condition)</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>a[] = [1, 2, 3, 4, 5], k = 5</span>
<span style="font-size: 18px;"><strong>Output: </strong>3</span>
<span style="font-size: 18px;"><strong style="font-size: 18px;">Explanation:</strong><span style="font-size: 18px;">
[1, 2] and [3, 4, 5] -&gt; 2 + 3 ≥ 5
[1, 2, 3] and [4, 5] -&gt; 3 + 4 ≥ 5
[1, 2, 3, 4] and [5] -&gt; 4 + 5 ≥ 5</span></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>6</sup><br>0 ≤ k ≤ 10<sup>6</sup><br>0 ≤ a[i] ≤ 10<sup>6</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Prefix Sum</code>&nbsp;<code>Arrays</code>&nbsp;