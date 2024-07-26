package org.solanaleaderboard.search;

import org.solanaleaderboard.entity.PubKey;

import java.util.List;

public interface MemberLookUp {
    public List<PubKey> getPublicKeysByPage(int pageNumber);
}
