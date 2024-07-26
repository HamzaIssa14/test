package org.solanaleaderboard.leaderboard;

import org.solanaleaderboard.entity.MemberPerformance;

import java.util.List;

public class LeaderboardService implements Leaderboard{

    @Override
    public List<MemberPerformance> getLeaderboard(int page) {
        //  influencerService.getPublicKeysByPage(page)
        //  res = performanceService.getPerformanceByPublicKey(List<pubkey>)
        // return res
        return List.of();
    }
}
