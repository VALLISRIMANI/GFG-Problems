<h2><a href="https://www.geeksforgeeks.org/problems/minimum-cost-to-destination/1?page=1&category=Dynamic%20Programming&sortBy=latest">Minimum cost to Destination</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">You are given a matrix <strong>cost[][]</strong> of size n x m. Each cell contains a value that represents the cost to move through that cell. You start at the top-left cell (0,0) and must reach the bottom-right cell (n-1, m-1). From any cell (i, j), you can move to <strong>(i, j+1),</strong> <strong>(i+1, j)</strong>, or <strong>(i+1, j+1)</strong>. </span></p>
<p><span style="font-size: 14pt;">Find the <strong>minimum cost</strong> required to reach the bottom-right corner. The cost of a path is the sum of all values on the path including both the start and end cells.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: n = 3, m = 3,
cost[][] = [[1, 2, 3], 
&nbsp;         [4, 8, 2], 
&nbsp;         [1, 5, 3]]
<strong>Output:</strong> 8
<strong>Explanation</strong>: One minimum-cost path is (0,0) → (0,1) → (1,2) → (2,2), with total cost 1 + 2 + 2 + 3 = 8.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>n = 2, m = 2,
cost[][] = [[5, 6],
&nbsp;         [7, 2]]
<strong>Output: </strong>7 
<strong>Explanation: </strong>The minimum-cost path is (0,0) → (1,1), with total cost 5 + 2 = 7.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:<br></strong>1&nbsp;<span style="font-family: 'Helvetica Neue';">≤ n</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">, m </span><span style="font-family: 'Helvetica Neue';">≤ </span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">1000<br></span>0&nbsp;<span style="font-family: 'Helvetica Neue';">≤ cost[i][j]</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">&nbsp;</span><span style="font-family: 'Helvetica Neue';">≤</span><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;"> 10<sup>5</sup></span></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;