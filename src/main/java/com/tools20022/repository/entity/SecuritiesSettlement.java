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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.msg.AdditionalInformation5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Settlement of the securities in a securities transaction, that is, the
 * instruction to deliver or receive securities, involving the payment of an
 * amount of money or not.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlement" src="doc-files/SecuritiesSettlement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TransferOperation
 * SecuritiesSettlement.TransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementDate
 * SecuritiesSettlement.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PartyRole
 * SecuritiesSettlement.PartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementAmount
 * SecuritiesSettlement.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#HoldingsPlanType
 * SecuritiesSettlement.HoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesMovementType
 * SecuritiesSettlement.SecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementQuantity
 * SecuritiesSettlement.SettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesTradeExecution
 * SecuritiesSettlement.SecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#CurrencyToBuy
 * SecuritiesSettlement.CurrencyToBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#CurrencyToSell
 * SecuritiesSettlement.CurrencyToSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#DenominationChoice
 * SecuritiesSettlement.DenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementTransactionCondition
 * SecuritiesSettlement.SettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#BeneficialOwnershipIndicator
 * SecuritiesSettlement.BeneficialOwnershipIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#MarketClientSide
 * SecuritiesSettlement.MarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Tracking
 * SecuritiesSettlement.Tracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#LetterOfGuarantee
 * SecuritiesSettlement.LetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#EligibleForCollateral
 * SecuritiesSettlement.EligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterestIndicator
 * SecuritiesSettlement.AccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PreConfirmation
 * SecuritiesSettlement.PreConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesRealTimeGrossSettlement
 * SecuritiesSettlement.SecuritiesRealTimeGrossSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#BlockTrade
 * SecuritiesSettlement.BlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementSystemMethod
 * SecuritiesSettlement.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AutomaticBorrowing
 * SecuritiesSettlement.AutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PartialSettlementIndicator
 * SecuritiesSettlement.PartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#HoldIndicator
 * SecuritiesSettlement.HoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RequestedSafekeepingPlace
 * SecuritiesSettlement.RequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#PairOff
 * SecuritiesSettlement.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#AccruedInterest
 * SecuritiesSettlement.AccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SecuritiesClearing
 * SecuritiesSettlement.SecuritiesClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Payment
 * SecuritiesSettlement.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettledAllocation
 * SecuritiesSettlement.SettledAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RelatedForeignExchangeOperation
 * SecuritiesSettlement.RelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Security
 * SecuritiesSettlement.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Position
 * SecuritiesSettlement.Position}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#Rollover
 * SecuritiesSettlement.Rollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#TurnedQuantity
 * SecuritiesSettlement.TurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementReason
 * SecuritiesSettlement.SettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#SettlementType
 * SecuritiesSettlement.SettlementType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesSettlement
 * Security.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#RelatedSecuritiesSettlement
 * Payment.RelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesSettlement
 * SecuritiesQuantity.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedTurnaroundSettlement
 * SecuritiesQuantity.RelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#RelatedSettlement
 * SecuritiesTransfer.RelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlement
 * SecuritiesSettlementPartyRole.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesSettlement
 * Interest.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesSettlement
 * SafekeepingPlace.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesSettlement
 * SecuritiesTradeExecution.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#SettlementExecutionParameters
 * Allocation.SettlementExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PairOff#RelatedSecuritiesSettlement
 * PairOff.RelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Rollover#SecuritiesSettlement
 * Rollover.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#SecuritiesSettlement
 * SecuritiesClearing.SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#SecuritiesSettlement
 * Position.SecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalInformation5
 * AdditionalInformation5}</li>
 * </ul>
 * </li>
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
 * "SecuritiesSettlement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not."
 * </li>
 * </ul>
 */
public class SecuritiesSettlement extends Settlement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Set of processes resulting in a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#RelatedSettlement
	 * SecuritiesTransfer.RelatedSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of processes resulting in a securities transfer."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransferOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransferOperation";
			definition = "Set of processes resulting in a securities transfer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.RelatedSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time at which a transaction is completed and cleared. <br>
	 * It can be an effective settlement date, that is, payment is effected and
	 * securities are delivered or an intended settlement date that is, the date
	 * and time at which the amount of money is intended to be moved.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies each role linked to the settlement of securities and played by
	 * a party at that step in a securities transaction flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlement
	 * SecuritiesSettlementPartyRole.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			type_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money settled or to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money settled or to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money settled or to be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Identifies whether or not saving plan or withdrawal or switch plan are
	 * included in the holdings.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingsPlanType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies if the movement on a securities account results from a deliver
	 * or a receive instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDeliveryCode
	 * ReceiveDeliveryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesMovementType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReceiveDeliveryCode.mmObject();
		}
	};
	/**
	 * Total quantity of securities to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#SecuritiesSettlement
	 * SecuritiesQuantity.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the trade which originates the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#SecuritiesSettlement
	 * SecuritiesTradeExecution.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade which originates the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the settlement process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account servicer is instructed to buy the indicated currency after the
	 * receipt of cash proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToBuy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CurrencyToBuy = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyToBuy";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Account servicer is instructed to sell a currency in order to obtain the
	 * currency needed to fund the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyToSell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CurrencyToSell = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyToSell";
			definition = "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Denomination (stated value found on financial instruments) of the
	 * security to be received or delivered.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Denomination (stated value found on financial instruments) of the security to be received or delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DenominationChoice = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination (stated value found on financial instruments) of the security to be received or delivered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Conditions under which the order/trade is to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionConditionCode
	 * SettlementTransactionConditionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditions under which the order/trade is to be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementTransactionCondition = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementTransactionConditionCode.mmObject();
		}
	};
	/**
	 * Specifies whether there is change of beneficial ownership.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether there is change of beneficial ownership."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BeneficialOwnershipIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipIndicator";
			definition = "Specifies whether there is change of beneficial ownership.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies if an instruction is for a market side or a client side
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MarketClientSideCode
	 * MarketClientSideCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClientSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if an instruction is for a market side or a client side transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MarketClientSide = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> MarketClientSideCode.mmObject();
		}
	};
	/**
	 * Specifies whether the loan and/or collateral is tracked.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the loan and/or collateral is tracked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Tracking = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether physical settlement may be executed using a letter of
	 * guarantee or if the physical certificates should be used.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LetterOfGuarantee = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether securities should be included in the pool of securities
	 * eligible for collateral purposes.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleForCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether securities should be included in the pool of securities eligible for collateral purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EligibleForCollateral = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether the net proceeds include interest accrued on the
	 * financial instrument.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the net proceeds include interest accrued on the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccruedInterestIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the net proceeds include interest accrued on the financial instrument.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Pre-confirmation of the cash transfer pending the securities transfer, or
	 * vice versa.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode
	 * PreConfirmationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PreConfirmation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PreConfirmation";
			definition = "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PreConfirmationCode.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement transaction is to be settled through an
	 * RTGS or a non RTGS system.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRealTimeGrossSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecuritiesRealTimeGrossSettlement = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRealTimeGrossSettlement";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement instruction is a block parent or child.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BlockTradeCode
	 * BlockTradeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is a block parent or child."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BlockTrade = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BlockTradeCode.mmObject();
		}
	};
	/**
	 * Specifies whether the settlement instruction is to be settled through the
	 * default or the alternate settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementSystemMethodCode
	 * SettlementSystemMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementSystemMethod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SettlementSystemMethodCode.mmObject();
		}
	};
	/**
	 * Condition for automatic borrowing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AutoBorrowingCode
	 * AutoBorrowingCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition for automatic borrowing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AutomaticBorrowing = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AutoBorrowingCode.mmObject();
		}
	};
	/**
	 * Specifies whether partial settlement is allowed.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether partial settlement is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialSettlementIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies whether the transaction is on hold/blocked/frozen.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is on hold/blocked/frozen."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Place requested as the place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesSettlement
	 * SafekeepingPlace.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place requested as the place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RequestedSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RequestedSafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SafekeepingPlace.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Buy and sell trades are settled in cash, based on the difference in the
	 * prices between the off-setting trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#RelatedSecuritiesSettlement
	 * PairOff.RelatedSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PairOff PairOff}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PairOff = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.RelatedSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest included in the settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#SecuritiesSettlement
	 * Interest.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest included in the settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AccruedInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccruedInterest";
			definition = "Interest included in the settlement.";
			minOccurs = 0;
			type_lazy = () -> Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing process which triggers the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#SecuritiesSettlement
	 * SecuritiesClearing.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesClearing
	 * SecuritiesClearing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing process which triggers the settlement process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesClearing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process which triggers the settlement process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the cash payment information of a securities settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#RelatedSecuritiesSettlement
	 * Payment.RelatedSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the cash payment information of a securities settlement."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the cash payment information of a securities settlement.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.RelatedSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Allocation which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#SettlementExecutionParameters
	 * Allocation.SettlementExecutionParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation which is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettledAllocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettledAllocation";
			definition = "Allocation which is settled.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Allocation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.SettlementExecutionParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entry details related to currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#CurrencyExchangeForSecuritiesSettlement
	 * ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedForeignExchangeOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry details related to currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedForeignExchangeOperation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedForeignExchangeOperation";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 0;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesSettlement
	 * Security.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security which is settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is settled.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information on the quantities and amounts to be settled in a position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#SecuritiesSettlement
	 * Position.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Position"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on the quantities and amounts to be settled in a position."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Position = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Information on the quantities and amounts to be settled in a position.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Position.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Process whereby a financial instrument is reinvested at maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rollover#SecuritiesSettlement
	 * Rollover.SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Rollover Rollover}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process whereby a financial instrument is reinvested at maturity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Rollover = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Process whereby a financial instrument is reinvested at maturity.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Rollover.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Rollover.SecuritiesSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#RelatedTurnaroundSettlement
	 * SecuritiesQuantity.RelatedTurnaroundSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TurnedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TurnedQuantity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TurnedQuantity";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.RelatedTurnaroundSettlement;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the reason for the settlement related to the type of underlying
	 * trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ObligationTypeCode
	 * ObligationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the settlement related to the type of underlying trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementReason = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement related to the type of underlying trade.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ObligationTypeCode.mmObject();
		}
	};
	/**
	 * Specifies how the transaction is to be settled, eg, against payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptTypeCode
	 * DeliveryReceiptTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, eg, against payment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SettlementType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesSettlement.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlement";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.SecuritiesSettlement, com.tools20022.repository.entity.Payment.RelatedSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesQuantity.RelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.RelatedSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlement,
						com.tools20022.repository.entity.Interest.SecuritiesSettlement, com.tools20022.repository.entity.SafekeepingPlace.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesTradeExecution.SecuritiesSettlement,
						com.tools20022.repository.entity.ForeignExchangeTrade.CurrencyExchangeForSecuritiesSettlement, com.tools20022.repository.entity.Allocation.SettlementExecutionParameters,
						com.tools20022.repository.entity.PairOff.RelatedSecuritiesSettlement, com.tools20022.repository.entity.Rollover.SecuritiesSettlement, com.tools20022.repository.entity.SecuritiesClearing.SecuritiesSettlement,
						com.tools20022.repository.entity.Position.SecuritiesSettlement);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.TransferOperation, com.tools20022.repository.entity.SecuritiesSettlement.SettlementDate,
						com.tools20022.repository.entity.SecuritiesSettlement.PartyRole, com.tools20022.repository.entity.SecuritiesSettlement.SettlementAmount, com.tools20022.repository.entity.SecuritiesSettlement.HoldingsPlanType,
						com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesMovementType, com.tools20022.repository.entity.SecuritiesSettlement.SettlementQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesSettlement.CurrencyToBuy,
						com.tools20022.repository.entity.SecuritiesSettlement.CurrencyToSell, com.tools20022.repository.entity.SecuritiesSettlement.DenominationChoice,
						com.tools20022.repository.entity.SecuritiesSettlement.SettlementTransactionCondition, com.tools20022.repository.entity.SecuritiesSettlement.BeneficialOwnershipIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.MarketClientSide, com.tools20022.repository.entity.SecuritiesSettlement.Tracking, com.tools20022.repository.entity.SecuritiesSettlement.LetterOfGuarantee,
						com.tools20022.repository.entity.SecuritiesSettlement.EligibleForCollateral, com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterestIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.PreConfirmation, com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesRealTimeGrossSettlement,
						com.tools20022.repository.entity.SecuritiesSettlement.BlockTrade, com.tools20022.repository.entity.SecuritiesSettlement.SettlementSystemMethod,
						com.tools20022.repository.entity.SecuritiesSettlement.AutomaticBorrowing, com.tools20022.repository.entity.SecuritiesSettlement.PartialSettlementIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.HoldIndicator, com.tools20022.repository.entity.SecuritiesSettlement.RequestedSafekeepingPlace, com.tools20022.repository.entity.SecuritiesSettlement.PairOff,
						com.tools20022.repository.entity.SecuritiesSettlement.AccruedInterest, com.tools20022.repository.entity.SecuritiesSettlement.SecuritiesClearing, com.tools20022.repository.entity.SecuritiesSettlement.Payment,
						com.tools20022.repository.entity.SecuritiesSettlement.SettledAllocation, com.tools20022.repository.entity.SecuritiesSettlement.RelatedForeignExchangeOperation,
						com.tools20022.repository.entity.SecuritiesSettlement.Security, com.tools20022.repository.entity.SecuritiesSettlement.Position, com.tools20022.repository.entity.SecuritiesSettlement.Rollover,
						com.tools20022.repository.entity.SecuritiesSettlement.TurnedQuantity, com.tools20022.repository.entity.SecuritiesSettlement.SettlementReason, com.tools20022.repository.entity.SecuritiesSettlement.SettlementType);
				derivationComponent_lazy = () -> Arrays.asList(AdditionalInformation5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}