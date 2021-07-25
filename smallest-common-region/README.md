<h2>1257. Smallest Common Region</h2><h3>Medium</h3><hr><div><p>You are given some lists of <code>regions</code>&nbsp;where the first region of each list includes all other regions in that list.</p>

<p>Naturally, if a region <code>X</code>&nbsp;contains another region <code>Y</code>&nbsp;then <code>X</code>&nbsp;is bigger than <code>Y</code>. Also by definition a region X contains itself.</p>

<p>Given two regions <code>region1</code>, <code>region2</code>, find out the <strong>smallest</strong> region that contains both of them.</p>

<p>If you are given regions <code>r1</code>, <code>r2</code> and <code>r3</code> such that <code>r1</code> includes <code>r3</code>, it is guaranteed there is no <code>r2</code> such that <code>r2</code> includes <code>r3</code>.<br>
<br>
It's guaranteed the smallest region exists.</p>

<p>&nbsp;</p>
<p><strong>Example 1:</strong></p>

<pre><strong>Input:
</strong>regions = [["Earth","North America","South America"],
["North America","United States","Canada"],
["United States","New York","Boston"],
["Canada","Ontario","Quebec"],
["South America","Brazil"]],
region1 = "Quebec",
region2 = "New York"
<strong>Output:</strong> "North America"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= regions.length &lt;= 10^4</code></li>
	<li><code>region1 != region2</code></li>
	<li>All strings consist of English letters and spaces with at most 20 letters.</li>
</ul>
</div>