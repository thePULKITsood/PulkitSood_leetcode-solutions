<h2>909. Snakes and Ladders</h2><h3>Medium</h3><hr><div><p><nr-sentence class="nr-s0" id="nr-s0" page="0">You are given an </nr-sentence><code><nr-sentence class="nr-s0" id="nr-s0" page="0">n x n</nr-sentence></code><nr-sentence class="nr-s0" id="nr-s0" page="0"> integer matrix </nr-sentence><code><nr-sentence class="nr-s0" id="nr-s0" page="0">board</nr-sentence></code><nr-sentence class="nr-s0" id="nr-s0" page="0"> where the cells are labeled from </nr-sentence><code><nr-sentence class="nr-s0" id="nr-s0" page="0">1</nr-sentence></code><nr-sentence class="nr-s0" id="nr-s0" page="0"> to </nr-sentence><code><nr-sentence class="nr-s0" id="nr-s0" page="0">n</nr-sentence><sup style="">2</sup></code><nr-sentence class="nr-s0" id="nr-s0" page="0"> in a </nr-sentence><a href="https://en.wikipedia.org/wiki/Boustrophedon" target="_blank"><strong><nr-sentence class="nr-s0" id="nr-s0" page="0">Boustrophedon style</nr-sentence></strong></a><nr-sentence class="nr-s0" id="nr-s0" page="0"> starting from the bottom left of the board (i.e. </nr-sentence><code><nr-sentence class="nr-s0" id="nr-s0" page="0">board[n - 1][0]</nr-sentence></code><nr-sentence class="nr-s0" id="nr-s0" page="0">) and alternating direction each row.</nr-sentence></p>

<p><nr-sentence class="nr-s1" id="nr-s1" page="0">You start on square </nr-sentence><code><nr-sentence class="nr-s1" id="nr-s1" page="0">1</nr-sentence></code><nr-sentence class="nr-s1" id="nr-s1" page="0"> of the board.</nr-sentence><nr-sentence class="nr-s2" id="nr-s2" page="0"> In each move, starting from square </nr-sentence><code><nr-sentence class="nr-s2" id="nr-s2" page="0">curr</nr-sentence></code><nr-sentence class="nr-s2" id="nr-s2" page="0">, do the following:</nr-sentence></p>

<ul>
	<li>Choose a destination square <code><nr-sentence class="nr-s3" id="nr-s3" page="0">next</nr-sentence></code> with a label in the range <code><nr-sentence class="nr-s4" id="nr-s4" page="0">[curr + 1, min(curr + 6, n</nr-sentence><sup style="">2</sup><nr-sentence class="nr-s4" id="nr-s4" page="0">)]</nr-sentence></code>.

	<ul>
		<li><nr-sentence class="nr-s5" id="nr-s5" page="0">This choice simulates the result of a standard </nr-sentence><strong><nr-sentence class="nr-s5" id="nr-s5" page="0">6-sided die roll</nr-sentence></strong><nr-sentence class="nr-s5" id="nr-s5" page="0">: i.e., there are always at most 6 destinations, regardless of the size of the board.</nr-sentence></li>
	</ul>
	</li>
	<li><nr-sentence class="nr-s6" id="nr-s6" page="0">If </nr-sentence><code><nr-sentence class="nr-s6" id="nr-s6" page="0">next</nr-sentence></code><nr-sentence class="nr-s6" id="nr-s6" page="0"> has a snake or ladder, you </nr-sentence><strong><nr-sentence class="nr-s6" id="nr-s6" page="0">must</nr-sentence></strong><nr-sentence class="nr-s6" id="nr-s6" page="0"> move to the destination of that snake or ladder.</nr-sentence><nr-sentence class="nr-s7" id="nr-s7" page="0"> Otherwise, you move to </nr-sentence><code><nr-sentence class="nr-s7" id="nr-s7" page="0">next</nr-sentence></code>.</li>
	<li><nr-sentence class="nr-s8" id="nr-s8" page="0">The game ends when you reach the square </nr-sentence><code><nr-sentence class="nr-s8" id="nr-s8" page="0">n</nr-sentence><sup style="">2</sup></code><nr-sentence class="nr-s8" id="nr-s8" page="0">.</nr-sentence></li>
</ul>

<p><nr-sentence class="nr-s9" id="nr-s9" page="0">A board square on row </nr-sentence><code><nr-sentence class="nr-s9" id="nr-s9" page="0">r</nr-sentence></code><nr-sentence class="nr-s9" id="nr-s9" page="0"> and column </nr-sentence><code><nr-sentence class="nr-s9" id="nr-s9" page="0">c</nr-sentence></code><nr-sentence class="nr-s9" id="nr-s9" page="0"> has a snake or ladder if </nr-sentence><code><nr-sentence class="nr-s9" id="nr-s9" page="0">board[r][c] != -1</nr-sentence></code><nr-sentence class="nr-s9" id="nr-s9" page="0">.</nr-sentence><nr-sentence class="nr-s10" id="nr-s10" page="0"> The destination of that snake or ladder is </nr-sentence><code><nr-sentence class="nr-s10" id="nr-s10" page="0">board[r][c]</nr-sentence></code><nr-sentence class="nr-s11" id="nr-s11" page="0">. Squares </nr-sentence><code><nr-sentence class="nr-s11" id="nr-s11" page="0">1</nr-sentence></code><nr-sentence class="nr-s11" id="nr-s11" page="0"> and </nr-sentence><code><nr-sentence class="nr-s11" id="nr-s11" page="0">n</nr-sentence><sup style="">2</sup></code><nr-sentence class="nr-s11" id="nr-s11" page="0"> do not have a snake or ladder.</nr-sentence></p>

<p><nr-sentence class="nr-s12" id="nr-s12" page="0">Note that you only take a snake or ladder at most once per move.</nr-sentence><nr-sentence class="nr-s13" id="nr-s13" page="0"> If the destination to a snake or ladder is the start of another snake or ladder, you do </nr-sentence><strong><nr-sentence class="nr-s13" id="nr-s13" page="0">not</nr-sentence></strong><nr-sentence class="nr-s13" id="nr-s13" page="0"> follow the subsequent&nbsp;snake or ladder.</nr-sentence></p>

<ul>
	<li><nr-sentence class="nr-s14" id="nr-s14" page="0">For example, suppose the board is </nr-sentence><code><nr-sentence class="nr-s14" id="nr-s14" page="0">[[-1,4],[-1,3]]</nr-sentence></code><nr-sentence class="nr-s14" id="nr-s14" page="0">, and on the first move, your destination square is </nr-sentence><code><nr-sentence class="nr-s14" id="nr-s14" page="0">2</nr-sentence></code><nr-sentence class="nr-s14" id="nr-s14" page="0">.</nr-sentence><nr-sentence class="nr-s15" id="nr-s15" page="0"> You follow the ladder to square </nr-sentence><code><nr-sentence class="nr-s15" id="nr-s15" page="0">3</nr-sentence></code><nr-sentence class="nr-s15" id="nr-s15" page="0">, but do </nr-sentence><strong><nr-sentence class="nr-s15" id="nr-s15" page="0">not</nr-sentence></strong><nr-sentence class="nr-s15" id="nr-s15" page="0"> follow the subsequent ladder to </nr-sentence><code>4</code>.</li>
</ul>

<p><nr-sentence class="nr-s16" id="nr-s16" page="0">Return </nr-sentence><em><nr-sentence class="nr-s16" id="nr-s16" page="0">the least number of moves required to reach the square </nr-sentence></em><code><nr-sentence class="nr-s16" id="nr-s16" page="0">n</nr-sentence><sup style="">2</sup></code><em><nr-sentence class="nr-s16" id="nr-s16" page="0">. If it is not possible to reach the square, return </nr-sentence></em><code><nr-sentence class="nr-s16" id="nr-s16" page="0">-1</nr-sentence></code><nr-sentence class="nr-s16" id="nr-s16" page="0">.</nr-sentence></p>

<p>&nbsp;</p>
<p><strong><nr-sentence class="nr-s17" id="nr-s17" page="0">Example 1:</nr-sentence></strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/09/23/snakes.png" style="width: 500px; height: 394px;">
<pre><strong><nr-sentence class="nr-s18" id="nr-s18" page="0">Input:</nr-sentence></strong><nr-sentence class="nr-s18" id="nr-s18" page="0"> board = [[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,-1,-1,-1,-1,-1],[-1,35,-1,-1,13,-1],[-1,-1,-1,-1,-1,-1],[-1,15,-1,-1,-1,-1]]
</nr-sentence><strong><nr-sentence class="nr-s18" id="nr-s18" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-s18" id="nr-s18" page="0"> 4
</nr-sentence><strong><nr-sentence class="nr-s18" id="nr-s18" page="0">Explanation:</nr-sentence></strong><nr-sentence class="nr-s18" id="nr-s18" page="0"> 
In the beginning, you start at square 1 (at row 5, column 0).</nr-sentence><nr-sentence class="nr-s19" id="nr-s19" page="0">
You decide to move to square 2 and must take the ladder to square 15.</nr-sentence><nr-sentence class="nr-s20" id="nr-s20" page="0">
You then decide to move to square 17 and must take the snake to square 13.</nr-sentence><nr-sentence class="nr-s21" id="nr-s21" page="0">
You then decide to move to square 14 and must take the ladder to square 35.</nr-sentence><nr-sentence class="nr-s22" id="nr-s22" page="0">
You then decide to move to square 36, ending the game.</nr-sentence><nr-sentence class="nr-s23" id="nr-s23" page="0">
This is the lowest possible number of moves to reach the last square, so return 4.</nr-sentence>
</pre>

<p><strong><nr-sentence class="nr-s24" id="nr-s24" page="0">Example 2:</nr-sentence></strong></p>

<pre><strong><nr-sentence class="nr-s25" id="nr-s25" page="0">Input:</nr-sentence></strong><nr-sentence class="nr-s25" id="nr-s25" page="0"> board = [[-1,-1],[-1,3]]
</nr-sentence><strong><nr-sentence class="nr-s25" id="nr-s25" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-s25" id="nr-s25" page="0"> 1</nr-sentence>
</pre>

<p>&nbsp;</p>
<p><strong><nr-sentence class="nr-s26" id="nr-s26" page="0">Constraints:</nr-sentence></strong></p>

<ul>
	<li><code><nr-sentence class="nr-s27" id="nr-s27" page="0">n == board.length == board[i].length</nr-sentence></code></li>
	<li><code><nr-sentence class="nr-s28" id="nr-s28" page="0">2 &lt;= n &lt;= 20</nr-sentence></code></li>
	<li><code><nr-sentence class="nr-s29" id="nr-s29" page="0">grid[i][j]</nr-sentence></code><nr-sentence class="nr-s29" id="nr-s29" page="0"> is either </nr-sentence><code><nr-sentence class="nr-s29" id="nr-s29" page="0">-1</nr-sentence></code><nr-sentence class="nr-s29" id="nr-s29" page="0"> or in the range </nr-sentence><code><nr-sentence class="nr-s29" id="nr-s29" page="0">[1, n</nr-sentence><sup style="">2</sup><nr-sentence class="nr-s29" id="nr-s29" page="0">]</nr-sentence></code>.</li>
	<li><nr-sentence class="nr-s30" id="nr-s30" page="0">The squares labeled </nr-sentence><code><nr-sentence class="nr-s30" id="nr-s30" page="0">1</nr-sentence></code><nr-sentence class="nr-s30" id="nr-s30" page="0"> and </nr-sentence><code><nr-sentence class="nr-s30" id="nr-s30" page="0">n</nr-sentence><sup style="">2</sup></code><nr-sentence class="nr-s30" id="nr-s30" page="0"> do not have any ladders or snakes.</nr-sentence></li>
</ul>
</div>