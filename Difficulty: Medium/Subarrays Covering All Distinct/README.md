<h2><a href="https://www.geeksforgeeks.org/problems/equivalent-sub-arrays3731/1">Subarrays Covering All Distinct</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">You are given an integer array <strong>arr[]</strong>. </span><span style="font-size: 18px;">Count the number of subarrays whose count of distinct<strong> </strong>is exactly<strong> </strong>the same as the count of distinct in the entire array.</span></p><p><span style="font-size: 18px;"><strong>Examples:</strong></span></p><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 1, 3, 2, 3]
<strong>Output:</strong> 5
<strong>Explanation</strong>:
The entire array contains 3 distinct elements: [1, 2, 3].
The subarrays that also contain all 3 distinct elements are:
arr[0..2] = [2, 1, 3]
arr[0..3] = [2, 1, 3, 2]
arr[0..4] = [2, 1, 3, 2, 3]
arr[1..3] = [1, 3, 2]
arr[1..4] = [1, 3, 2, 3]<br></span><span style="font-size: 14pt;">Hence, the total number of such subarrays is 5.</span></pre><pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [2, 4, 4, 2, 4]
<strong>Output:</strong> 9<br></span><strong><span style="font-size: 14pt;">Explanation: </span></strong><span style="font-size: 14pt;">The entire array contains 2 distinct elements: [2, 4]. <br>Therefore, we need to count all subarrays that contain both 2 and 4.
The valid subarrays are:
arr[0..1] = [2, 4]
arr[0..2] = [2, 4, 4]
arr[0..3] = [2, 4, 4, 2]
arr[0..4] = [2, 4, 4, 2, 4]
arr[1..3] = [4, 4, 2]
arr[1..4] = [4, 4, 2, 4]
arr[2..3] = [4, 2]
arr[2..4] = [4, 2, 4]
arr[3..4] = [2, 4]
Hence, the total number of such subarrays is 9.</span></pre></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>sliding-window</code>&nbsp;<code>two-pointer-algorithm</code>&nbsp;<code>Arrays</code>&nbsp;<code>Hash</code>&nbsp;