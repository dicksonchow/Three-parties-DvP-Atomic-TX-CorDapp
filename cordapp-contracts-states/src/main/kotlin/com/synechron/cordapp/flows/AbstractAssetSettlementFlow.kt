package com.synechron.cordapp.flows

import net.corda.core.flows.FlowLogic
import net.corda.core.flows.InitiatingFlow

@InitiatingFlow
abstract class AbstractAssetSettlementFlow<out T> : FlowLogic<T>(), FlowLogicCommonMethods