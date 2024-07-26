package org.solanaleaderboard.search;

import org.solanaleaderboard.entity.PubKey;

import java.util.List;

public class MemberCacheDbAccessor implements MemberLookUp{

    @Override
    public List<PubKey> getPublicKeysByPage(int pageNumber) {
        // publicKeys;
        // try {
        //      publicKeys = cache.getPublicKeyByPage(page)
        // } catch (NoObjectFound){
        //      publicKeys = db.getPublicKeyByPage
        //      cache.updateCacheByPage(page)
        // }
        // return publicKeys
        return List.of();
    }
}
