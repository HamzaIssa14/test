package org.solanaleaderboard.leaderboard;

import org.solanaleaderboard.entity.MemberPerformance;

import java.util.List;

public interface Leaderboard {
    List<MemberPerformance> getLeaderboard(int page);

}
