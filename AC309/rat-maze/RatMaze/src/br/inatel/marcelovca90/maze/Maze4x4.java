package br.inatel.marcelovca90.maze;

public class Maze4x4 extends Maze
{
    @Override
    public int[][] getMaze()
    {
        return new int[][] {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
    }
}
