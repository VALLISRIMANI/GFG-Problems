<h2><a href="https://www.geeksforgeeks.org/problems/minimum-steps-to-reach-last-column-of-binary-matrix/1">Minimum Steps to Reach Last Column from First</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p data-start="352" data-end="488"><span style="font-size: 14pt;">Given an <strong>n × n</strong> binary matrix <strong>mat[][]</strong>, where:</span></p>
<ul>
<li data-start="352" data-end="488"><span style="font-size: 14pt;">0 represents an empty cell.</span></li>
<li data-start="352" data-end="488"><span style="font-size: 14pt;">1 represents a blocked cell.</span></li>
</ul>
<p data-start="352" data-end="488"><span style="font-size: 14pt;">Find the minimum steps required to reach any empty cell in the last column starting from any empty cell in the first column. From a cell, you can move to any of its four adjacent cells (up, down, left, or right) provided the destination cell is empty.</span></p>
<p data-start="352" data-end="488"><span style="font-size: 14pt;">If it is not possible to reach, return -1.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>mat[][] = [[0 0 1], [1 0 0], [0 0 0]]
<strong>Output: </strong>2
<strong>Explanation: </strong></span><span style="font-size: 18px;">Start from cell (2, 0) and move to (2, 1) and then (2, 2). Thus, the minimum number of steps required is 2<strong>.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/931088/Web/Other/blobid0_1784983398.png" width="259" height="124"><br></strong></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>mat[][] = [[1 0], [0 1]]
<strong>Output:</strong>-1
<strong>Explanation: </strong></span><span style="font-size: 18px;">There is no path from any empty cell in the first column to any empty cell in the last column.<br><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/931088/Web/Other/blobid2_1784983415.png" width="249" height="119"><br></span></pre>
<p><span style="font-size: 18px;"><strong style="font-size: 18px;">Constraints:<br></strong></span><span style="font-size: 18px;">1 ≤ matrix.size() ≤ 10<sup>3</sup><br></span><span style="font-size: 18px;"><span style="font-size: 18px;">0 ≤ matrix[i][j] ≤ 1</span></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>BFS</code>&nbsp;