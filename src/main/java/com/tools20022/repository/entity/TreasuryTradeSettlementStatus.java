/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.SettlementStatusCode;
import com.tools20022.repository.codeset.TradeStatusCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of a treasury trade at a specified time.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TreasuryTradeSettlementStatus"
 * src="doc-files/TreasuryTradeSettlementStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#TradeStatus
 * TreasuryTradeSettlementStatus.TradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#AllegedTrade
 * TreasuryTradeSettlementStatus.AllegedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#TreasuryTrade
 * TreasuryTradeSettlementStatus.TreasuryTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#Settlement
 * TreasuryTradeSettlementStatus.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#RejectedAmount
 * TreasuryTradeSettlementStatus.RejectedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#SettlementSuspended
 * TreasuryTradeSettlementStatus.SettlementSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#PendingSettlement
 * TreasuryTradeSettlementStatus.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#SettlementDate
 * TreasuryTradeSettlementStatus.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#WithdrawalReason
 * TreasuryTradeSettlementStatus.WithdrawalReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#TreasuryTradeSettlementStatus
 * TreasuryTrade.TreasuryTradeSettlementStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TreasuryTradeSettlementStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a treasury trade at a specified time."
 * </li>
 * </ul>
 */
public class TreasuryTradeSettlementStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Status of a treasury trade in a central matching/settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeStatusCode
	 * TradeStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a treasury trade in a central matching/settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradeStatus = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeStatus";
			definition = "Status of a treasury trade in a central matching/settlement system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TradeStatusCode.mmObject();
		}
	};
	/**
	 * Specifies whether a trade is alleged (notified by the counterparty) or
	 * not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllegedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a trade is alleged (notified by the counterparty) or not."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AllegedTrade = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllegedTrade";
			definition = "Specifies whether a trade is alleged (notified by the counterparty) or not.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Treasury trade for which a settlement status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTrade#TreasuryTradeSettlementStatus
	 * TreasuryTrade.TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TreasuryTrade
	 * TreasuryTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Treasury trade for which a settlement status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TreasuryTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTrade";
			definition = "Treasury trade for which a settlement status is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of a settlement eg rejected, settled or awaiting
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatusCode
	 * SettlementStatusCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of a settlement eg rejected, settled or awaiting authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Settlement = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Settlement";
			definition = "Specifies the status of a settlement eg rejected, settled or awaiting authorisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementStatusCode.mmObject();
		}
	};
	/**
	 * Amount that cannot be settled for instance by a settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that cannot be settled for instance by a settlement system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RejectedAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RejectedAmount";
			definition = "Amount that cannot be settled for instance by a settlement system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Cash settlement is suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is suspended."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementSuspended = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementSuspended";
			definition = "Cash settlement is suspended.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Cash settlement is pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is pending."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PendingSettlement = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PendingSettlement";
			definition = "Cash settlement is pending.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date on which the trade is actually settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the trade is actually settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the trade is actually settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Reason that an alleged trade is withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus
	 * TreasuryTradeSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason that an alleged trade is withdrawn."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WithdrawalReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TreasuryTradeSettlementStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithdrawalReason";
			definition = "Reason that an alleged trade is withdrawn.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TreasuryTradeSettlementStatus";
				definition = "Specifies the status of a treasury trade at a specified time.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTrade.TreasuryTradeSettlementStatus);
				superType_lazy = () -> Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TradeStatus, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.AllegedTrade,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.TreasuryTrade, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.Settlement,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.RejectedAmount, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.SettlementSuspended,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.PendingSettlement, com.tools20022.repository.entity.TreasuryTradeSettlementStatus.SettlementDate,
						com.tools20022.repository.entity.TreasuryTradeSettlementStatus.WithdrawalReason);
			}
		});
		return mmObject_lazy.get();
	}
}