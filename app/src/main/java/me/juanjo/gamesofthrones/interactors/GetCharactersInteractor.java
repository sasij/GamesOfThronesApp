package me.juanjo.gamesofthrones.interactors;

import javax.inject.Inject;

import me.juanjo.gamesofthrones.events.GetCharactersEvent;
import me.juanjo.gamesofthrones.helpers.Bus.EventBus;

/**
 * Created with ♥
 *
 * @author Juanjo
 */
public class GetCharactersInteractor implements Interactor {

    @Inject
    EventBus bus;

    @Inject
    GetCharactersInteractor() {
    }

    @Override
    public void execute() {
        GetCharactersEvent event = new GetCharactersEvent();
        try {
            //TODO
            System.out.println("=> get chracters");
            //TODO
//        } catch (NoCharactersException e) {
        } catch (Exception e) {
            //TODO
            System.out.println("=>error");
        }
    }

//    private final String TAG = "GetBets";
//
//    private final EventBus mBus;
//
//    private final String mToken;
//
//    private final CashoutGetBetsRequestHolder mRequestHolder;
//
//    public GetCharactersInteractor(CashoutGetBetsRequestHolder cashoutBetRequest, EventBus bus, String token) {
//        mBus = bus;
//        mToken = token;
//        mRequestHolder = cashoutBetRequest;
//    }
//
//    @Override
//    public void execute() {
//        final GetBetsMessage event = new GetBetsMessage();
//        mRequestHolder
//                .setCashoutBetRequestListener(new CashoutGetBetsRequestHolder.CashoutBetRequestListener() {
//                    @Override
//                    public void onSuccess(CashOutBetsBaseModel cashOutBetsBaseModel) {
//                        Log.i(TAG, "onSuccessBets");
//                        if (cashOutBetsBaseModel.getStatus().isSuccess()) {
//                            event.setCashOutBets(cashOutBetsBaseModel);
//                        }
//                        mBus.post(event);
//                    }
//
//                    @Override
//                    public void onError(CustomVolleyError error) {
//                        Log.e(TAG, "onErrorBets");
//                        if (error != null) {
//                            event.setErrorMessage(error.getCustomMessage());
//                            mBus.post(event);
//                        }
//                    }
//                });
//        mRequestHolder.getBets(mToken);
//    }
}
