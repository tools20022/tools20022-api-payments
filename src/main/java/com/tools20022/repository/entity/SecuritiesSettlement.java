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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalInformation5;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Settlement
 * Settlement}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTransferOperation
 * SecuritiesSettlement.mmTransferOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
 * SecuritiesSettlement.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
 * SecuritiesSettlement.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
 * SecuritiesSettlement.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
 * SecuritiesSettlement.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementQuantity
 * SecuritiesSettlement.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesTradeExecution
 * SecuritiesSettlement.mmSecuritiesTradeExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmCurrencyToBuy
 * SecuritiesSettlement.mmCurrencyToBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmCurrencyToSell
 * SecuritiesSettlement.mmCurrencyToSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmDenominationChoice
 * SecuritiesSettlement.mmDenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementTransactionCondition
 * SecuritiesSettlement.mmSettlementTransactionCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBeneficialOwnershipIndicator
 * SecuritiesSettlement.mmBeneficialOwnershipIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmMarketClientSide
 * SecuritiesSettlement.mmMarketClientSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTracking
 * SecuritiesSettlement.mmTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmLetterOfGuarantee
 * SecuritiesSettlement.mmLetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmEligibleForCollateral
 * SecuritiesSettlement.mmEligibleForCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterestIndicator
 * SecuritiesSettlement.mmAccruedInterestIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPreConfirmation
 * SecuritiesSettlement.mmPreConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesRealTimeGrossSettlement
 * SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmBlockTrade
 * SecuritiesSettlement.mmBlockTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementSystemMethod
 * SecuritiesSettlement.mmSettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAutomaticBorrowing
 * SecuritiesSettlement.mmAutomaticBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartialSettlementIndicator
 * SecuritiesSettlement.mmPartialSettlementIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldIndicator
 * SecuritiesSettlement.mmHoldIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPairOff
 * SecuritiesSettlement.mmPairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmAccruedInterest
 * SecuritiesSettlement.mmAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesClearing
 * SecuritiesSettlement.mmSecuritiesClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPayment
 * SecuritiesSettlement.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettledAllocation
 * SecuritiesSettlement.mmSettledAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRelatedForeignExchangeOperation
 * SecuritiesSettlement.mmRelatedForeignExchangeOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
 * SecuritiesSettlement.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPosition
 * SecuritiesSettlement.mmPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRollover
 * SecuritiesSettlement.mmRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmTurnedQuantity
 * SecuritiesSettlement.mmTurnedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementReason
 * SecuritiesSettlement.mmSettlementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
 * SecuritiesSettlement.mmSettlementType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
 * Security.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
 * Payment.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
 * SecuritiesTransfer.mmRelatedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
 * Interest.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
 * SafekeepingPlace.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementExecutionParameters
 * Allocation.mmSettlementExecutionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PairOff#mmRelatedSecuritiesSettlement
 * PairOff.mmRelatedSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Rollover#mmSecuritiesSettlement
 * Rollover.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmSecuritiesSettlement
 * SecuritiesClearing.mmSecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Position#mmSecuritiesSettlement
 * Position.mmSecuritiesSettlement}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected SecuritiesTransfer transferOperation;
	/**
	 * Set of processes resulting in a securities transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmRelatedSettlement
	 * SecuritiesTransfer.mmRelatedSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmTransferOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferOperation";
			definition = "Set of processes resulting in a securities transfer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected ISODateTime settlementDate;
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
	public static final MMBusinessAttribute mmSettlementDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which a transaction is completed and cleared. \r\nIt can be an effective settlement date, that is, payment is effected and securities are delivered or an intended settlement date that is, the date and time at which the amount of money is intended to be moved.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole;
	/**
	 * Specifies each role linked to the settlement of securities and played by
	 * a party at that step in a securities transaction flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlement
	 * SecuritiesSettlementPartyRole.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the settlement of securities and played by a party at that step in a securities transaction flow.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount settlementAmount;
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
	public static final MMBusinessAttribute mmSettlementAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money settled or to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text holdingsPlanType;
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
	public static final MMBusinessAttribute mmHoldingsPlanType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getHoldingsPlanType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReceiveDeliveryCode securitiesMovementType;
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
	public static final MMBusinessAttribute mmSecuritiesMovementType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDeliveryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSecuritiesMovementType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesQuantity settlementQuantity;
	/**
	 * Total quantity of securities to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmSecuritiesSettlement
	 * SecuritiesQuantity.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmSettlementQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * Specifies the trade which originates the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Specifies the trade which originates the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected CurrencyCode currencyToBuy;
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
	public static final MMBusinessAttribute mmCurrencyToBuy = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToBuy";
			definition = "Account servicer is instructed to buy the indicated currency after the receipt of cash proceeds.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getCurrencyToBuy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode currencyToSell;
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
	public static final MMBusinessAttribute mmCurrencyToSell = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyToSell";
			definition = "Account servicer is instructed to sell a currency in order to obtain the currency needed to fund the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getCurrencyToSell", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text denominationChoice;
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
	public static final MMBusinessAttribute mmDenominationChoice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination (stated value found on financial instruments) of the security to be received or delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getDenominationChoice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementTransactionConditionCode settlementTransactionCondition;
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
	public static final MMBusinessAttribute mmSettlementTransactionCondition = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementTransactionCondition";
			definition = "Conditions under which the order/trade is to be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementTransactionConditionCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementTransactionCondition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator beneficialOwnershipIndicator;
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
	public static final MMBusinessAttribute mmBeneficialOwnershipIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BeneficialOwnershipIndicator";
			definition = "Specifies whether there is change of beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getBeneficialOwnershipIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketClientSideCode marketClientSide;
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
	public static final MMBusinessAttribute mmMarketClientSide = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClientSide";
			definition = "Specifies if an instruction is for a market side or a client side transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MarketClientSideCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getMarketClientSide", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator tracking;
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
	public static final MMBusinessAttribute mmTracking = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tracking";
			definition = "Specifies whether the loan and/or collateral is tracked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getTracking", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator letterOfGuarantee;
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
	public static final MMBusinessAttribute mmLetterOfGuarantee = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LetterOfGuarantee";
			definition = "Specifies whether physical settlement may be executed using a letter of guarantee or if the physical certificates should be used.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getLetterOfGuarantee", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator eligibleForCollateral;
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
	public static final MMBusinessAttribute mmEligibleForCollateral = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleForCollateral";
			definition = "Specifies whether securities should be included in the pool of securities eligible for collateral purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getEligibleForCollateral", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator accruedInterestIndicator;
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
	public static final MMBusinessAttribute mmAccruedInterestIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterestIndicator";
			definition = "Indicates whether the net proceeds include interest accrued on the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getAccruedInterestIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PreConfirmationCode preConfirmation;
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
	public static final MMBusinessAttribute mmPreConfirmation = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreConfirmation";
			definition = "Pre-confirmation of the cash transfer pending the securities transfer, or vice versa.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreConfirmationCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getPreConfirmation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator securitiesRealTimeGrossSettlement;
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
	public static final MMBusinessAttribute mmSecuritiesRealTimeGrossSettlement = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesRealTimeGrossSettlement";
			definition = "Specifies whether the settlement transaction is to be settled through an RTGS or a non RTGS system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSecuritiesRealTimeGrossSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BlockTradeCode blockTrade;
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
	public static final MMBusinessAttribute mmBlockTrade = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockTrade";
			definition = "Specifies whether the settlement instruction is a block parent or child.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BlockTradeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getBlockTrade", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementSystemMethodCode settlementSystemMethod;
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
	public static final MMBusinessAttribute mmSettlementSystemMethod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementSystemMethod";
			definition = "Specifies whether the settlement instruction is to be settled through the default or the alternate settlement system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementSystemMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementSystemMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AutoBorrowingCode automaticBorrowing;
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
	public static final MMBusinessAttribute mmAutomaticBorrowing = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutomaticBorrowing";
			definition = "Condition for automatic borrowing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AutoBorrowingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getAutomaticBorrowing", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator partialSettlementIndicator;
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
	public static final MMBusinessAttribute mmPartialSettlementIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialSettlementIndicator";
			definition = "Specifies whether partial settlement is allowed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getPartialSettlementIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator holdIndicator;
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
	public static final MMBusinessAttribute mmHoldIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HoldIndicator";
			definition = "Specifies whether the transaction is on hold/blocked/frozen.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getHoldIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SafekeepingPlace requestedSafekeepingPlace;
	/**
	 * Place requested as the place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
	 * SafekeepingPlace.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmRequestedSafekeepingPlace = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedSafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PairOff> pairOff;
	/**
	 * Buy and sell trades are settled in cash, based on the difference in the
	 * prices between the off-setting trades.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PairOff#mmRelatedSecuritiesSettlement
	 * PairOff.mmRelatedSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPairOff = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Buy and sell trades are settled in cash, based on the difference in the prices between the off-setting trades.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PairOff.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> accruedInterest;
	/**
	 * Interest included in the settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmSecuritiesSettlement
	 * Interest.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmAccruedInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccruedInterest";
			definition = "Interest included in the settlement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected SecuritiesClearing securitiesClearing;
	/**
	 * Clearing process which triggers the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesClearing#mmSecuritiesSettlement
	 * SecuritiesClearing.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesClearing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesClearing";
			definition = "Clearing process which triggers the settlement process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesClearing.mmObject();
		}
	};
	protected Payment payment;
	/**
	 * Specifies the cash payment information of a securities settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmRelatedSecuritiesSettlement
	 * Payment.mmRelatedSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Specifies the cash payment information of a securities settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected Allocation settledAllocation;
	/**
	 * Allocation which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmSettlementExecutionParameters
	 * Allocation.mmSettlementExecutionParameters}</li>
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
	public static final MMBusinessAssociationEnd mmSettledAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettledAllocation";
			definition = "Allocation which is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation;
	/**
	 * Entry details related to currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmCurrencyExchangeForSecuritiesSettlement
	 * ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedForeignExchangeOperation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedForeignExchangeOperation";
			definition = "Entry details related to currency exchange information.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Security which is settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesSettlement
	 * Security.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security which is settled.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected Position position;
	/**
	 * Information on the quantities and amounts to be settled in a position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmSecuritiesSettlement
	 * Position.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Position";
			definition = "Information on the quantities and amounts to be settled in a position.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	protected Rollover rollover;
	/**
	 * Process whereby a financial instrument is reinvested at maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Rollover#mmSecuritiesSettlement
	 * Rollover.mmSecuritiesSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmRollover = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rollover";
			definition = "Process whereby a financial instrument is reinvested at maturity.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Rollover.mmObject();
		}
	};
	protected SecuritiesQuantity turnedQuantity;
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRelatedTurnaroundSettlement
	 * SecuritiesQuantity.mmRelatedTurnaroundSettlement}</li>
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
	public static final MMBusinessAssociationEnd mmTurnedQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TurnedQuantity";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected ObligationTypeCode settlementReason;
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
	public static final MMBusinessAttribute mmSettlementReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementReason";
			definition = "Specifies the reason for the settlement related to the type of underlying trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ObligationTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DeliveryReceiptTypeCode settlementType;
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
	public static final MMBusinessAttribute mmSettlementType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementType";
			definition = "Specifies how the transaction is to be settled, eg, against payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlement.class.getMethod("getSettlementType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlement";
				definition = "Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmSecuritiesSettlement, com.tools20022.repository.entity.Payment.mmRelatedSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesQuantity.mmSecuritiesSettlement, com.tools20022.repository.entity.SecuritiesQuantity.mmRelatedTurnaroundSettlement,
						com.tools20022.repository.entity.SecuritiesTransfer.mmRelatedSettlement, com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlement,
						com.tools20022.repository.entity.Interest.mmSecuritiesSettlement, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmSecuritiesSettlement, com.tools20022.repository.entity.ForeignExchangeTrade.mmCurrencyExchangeForSecuritiesSettlement,
						com.tools20022.repository.entity.Allocation.mmSettlementExecutionParameters, com.tools20022.repository.entity.PairOff.mmRelatedSecuritiesSettlement, com.tools20022.repository.entity.Rollover.mmSecuritiesSettlement,
						com.tools20022.repository.entity.SecuritiesClearing.mmSecuritiesSettlement, com.tools20022.repository.entity.Position.mmSecuritiesSettlement);
				superType_lazy = () -> Settlement.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlement.mmTransferOperation, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementDate,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPartyRole, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementAmount, com.tools20022.repository.entity.SecuritiesSettlement.mmHoldingsPlanType,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesMovementType, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesSettlement.mmCurrencyToBuy,
						com.tools20022.repository.entity.SecuritiesSettlement.mmCurrencyToSell, com.tools20022.repository.entity.SecuritiesSettlement.mmDenominationChoice,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementTransactionCondition, com.tools20022.repository.entity.SecuritiesSettlement.mmBeneficialOwnershipIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmMarketClientSide, com.tools20022.repository.entity.SecuritiesSettlement.mmTracking, com.tools20022.repository.entity.SecuritiesSettlement.mmLetterOfGuarantee,
						com.tools20022.repository.entity.SecuritiesSettlement.mmEligibleForCollateral, com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterestIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPreConfirmation, com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesRealTimeGrossSettlement,
						com.tools20022.repository.entity.SecuritiesSettlement.mmBlockTrade, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementSystemMethod,
						com.tools20022.repository.entity.SecuritiesSettlement.mmAutomaticBorrowing, com.tools20022.repository.entity.SecuritiesSettlement.mmPartialSettlementIndicator,
						com.tools20022.repository.entity.SecuritiesSettlement.mmHoldIndicator, com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPairOff, com.tools20022.repository.entity.SecuritiesSettlement.mmAccruedInterest, com.tools20022.repository.entity.SecuritiesSettlement.mmSecuritiesClearing,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPayment, com.tools20022.repository.entity.SecuritiesSettlement.mmSettledAllocation,
						com.tools20022.repository.entity.SecuritiesSettlement.mmRelatedForeignExchangeOperation, com.tools20022.repository.entity.SecuritiesSettlement.mmSecurity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmPosition, com.tools20022.repository.entity.SecuritiesSettlement.mmRollover, com.tools20022.repository.entity.SecuritiesSettlement.mmTurnedQuantity,
						com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementReason, com.tools20022.repository.entity.SecuritiesSettlement.mmSettlementType);
				derivationComponent_lazy = () -> Arrays.asList(AdditionalInformation5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransfer getTransferOperation() {
		return transferOperation;
	}

	public void setTransferOperation(com.tools20022.repository.entity.SecuritiesTransfer transferOperation) {
		this.transferOperation = transferOperation;
	}

	public ISODateTime getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODateTime settlementDate) {
		this.settlementDate = settlementDate;
	}

	public List<SecuritiesSettlementPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.SecuritiesSettlementPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public Max35Text getHoldingsPlanType() {
		return holdingsPlanType;
	}

	public void setHoldingsPlanType(Max35Text holdingsPlanType) {
		this.holdingsPlanType = holdingsPlanType;
	}

	public ReceiveDeliveryCode getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public void setSecuritiesMovementType(ReceiveDeliveryCode securitiesMovementType) {
		this.securitiesMovementType = securitiesMovementType;
	}

	public SecuritiesQuantity getSettlementQuantity() {
		return settlementQuantity;
	}

	public void setSettlementQuantity(com.tools20022.repository.entity.SecuritiesQuantity settlementQuantity) {
		this.settlementQuantity = settlementQuantity;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
	}

	public CurrencyCode getCurrencyToBuy() {
		return currencyToBuy;
	}

	public void setCurrencyToBuy(CurrencyCode currencyToBuy) {
		this.currencyToBuy = currencyToBuy;
	}

	public CurrencyCode getCurrencyToSell() {
		return currencyToSell;
	}

	public void setCurrencyToSell(CurrencyCode currencyToSell) {
		this.currencyToSell = currencyToSell;
	}

	public Max35Text getDenominationChoice() {
		return denominationChoice;
	}

	public void setDenominationChoice(Max35Text denominationChoice) {
		this.denominationChoice = denominationChoice;
	}

	public SettlementTransactionConditionCode getSettlementTransactionCondition() {
		return settlementTransactionCondition;
	}

	public void setSettlementTransactionCondition(SettlementTransactionConditionCode settlementTransactionCondition) {
		this.settlementTransactionCondition = settlementTransactionCondition;
	}

	public YesNoIndicator getBeneficialOwnershipIndicator() {
		return beneficialOwnershipIndicator;
	}

	public void setBeneficialOwnershipIndicator(YesNoIndicator beneficialOwnershipIndicator) {
		this.beneficialOwnershipIndicator = beneficialOwnershipIndicator;
	}

	public MarketClientSideCode getMarketClientSide() {
		return marketClientSide;
	}

	public void setMarketClientSide(MarketClientSideCode marketClientSide) {
		this.marketClientSide = marketClientSide;
	}

	public YesNoIndicator getTracking() {
		return tracking;
	}

	public void setTracking(YesNoIndicator tracking) {
		this.tracking = tracking;
	}

	public YesNoIndicator getLetterOfGuarantee() {
		return letterOfGuarantee;
	}

	public void setLetterOfGuarantee(YesNoIndicator letterOfGuarantee) {
		this.letterOfGuarantee = letterOfGuarantee;
	}

	public YesNoIndicator getEligibleForCollateral() {
		return eligibleForCollateral;
	}

	public void setEligibleForCollateral(YesNoIndicator eligibleForCollateral) {
		this.eligibleForCollateral = eligibleForCollateral;
	}

	public YesNoIndicator getAccruedInterestIndicator() {
		return accruedInterestIndicator;
	}

	public void setAccruedInterestIndicator(YesNoIndicator accruedInterestIndicator) {
		this.accruedInterestIndicator = accruedInterestIndicator;
	}

	public PreConfirmationCode getPreConfirmation() {
		return preConfirmation;
	}

	public void setPreConfirmation(PreConfirmationCode preConfirmation) {
		this.preConfirmation = preConfirmation;
	}

	public YesNoIndicator getSecuritiesRealTimeGrossSettlement() {
		return securitiesRealTimeGrossSettlement;
	}

	public void setSecuritiesRealTimeGrossSettlement(YesNoIndicator securitiesRealTimeGrossSettlement) {
		this.securitiesRealTimeGrossSettlement = securitiesRealTimeGrossSettlement;
	}

	public BlockTradeCode getBlockTrade() {
		return blockTrade;
	}

	public void setBlockTrade(BlockTradeCode blockTrade) {
		this.blockTrade = blockTrade;
	}

	public SettlementSystemMethodCode getSettlementSystemMethod() {
		return settlementSystemMethod;
	}

	public void setSettlementSystemMethod(SettlementSystemMethodCode settlementSystemMethod) {
		this.settlementSystemMethod = settlementSystemMethod;
	}

	public AutoBorrowingCode getAutomaticBorrowing() {
		return automaticBorrowing;
	}

	public void setAutomaticBorrowing(AutoBorrowingCode automaticBorrowing) {
		this.automaticBorrowing = automaticBorrowing;
	}

	public YesNoIndicator getPartialSettlementIndicator() {
		return partialSettlementIndicator;
	}

	public void setPartialSettlementIndicator(YesNoIndicator partialSettlementIndicator) {
		this.partialSettlementIndicator = partialSettlementIndicator;
	}

	public YesNoIndicator getHoldIndicator() {
		return holdIndicator;
	}

	public void setHoldIndicator(YesNoIndicator holdIndicator) {
		this.holdIndicator = holdIndicator;
	}

	public SafekeepingPlace getRequestedSafekeepingPlace() {
		return requestedSafekeepingPlace;
	}

	public void setRequestedSafekeepingPlace(com.tools20022.repository.entity.SafekeepingPlace requestedSafekeepingPlace) {
		this.requestedSafekeepingPlace = requestedSafekeepingPlace;
	}

	public List<PairOff> getPairOff() {
		return pairOff;
	}

	public void setPairOff(List<com.tools20022.repository.entity.PairOff> pairOff) {
		this.pairOff = pairOff;
	}

	public List<Interest> getAccruedInterest() {
		return accruedInterest;
	}

	public void setAccruedInterest(List<com.tools20022.repository.entity.Interest> accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	public SecuritiesClearing getSecuritiesClearing() {
		return securitiesClearing;
	}

	public void setSecuritiesClearing(com.tools20022.repository.entity.SecuritiesClearing securitiesClearing) {
		this.securitiesClearing = securitiesClearing;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(com.tools20022.repository.entity.Payment payment) {
		this.payment = payment;
	}

	public Allocation getSettledAllocation() {
		return settledAllocation;
	}

	public void setSettledAllocation(com.tools20022.repository.entity.Allocation settledAllocation) {
		this.settledAllocation = settledAllocation;
	}

	public List<ForeignExchangeTrade> getRelatedForeignExchangeOperation() {
		return relatedForeignExchangeOperation;
	}

	public void setRelatedForeignExchangeOperation(List<com.tools20022.repository.entity.ForeignExchangeTrade> relatedForeignExchangeOperation) {
		this.relatedForeignExchangeOperation = relatedForeignExchangeOperation;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(com.tools20022.repository.entity.Position position) {
		this.position = position;
	}

	public Rollover getRollover() {
		return rollover;
	}

	public void setRollover(com.tools20022.repository.entity.Rollover rollover) {
		this.rollover = rollover;
	}

	public SecuritiesQuantity getTurnedQuantity() {
		return turnedQuantity;
	}

	public void setTurnedQuantity(com.tools20022.repository.entity.SecuritiesQuantity turnedQuantity) {
		this.turnedQuantity = turnedQuantity;
	}

	public ObligationTypeCode getSettlementReason() {
		return settlementReason;
	}

	public void setSettlementReason(ObligationTypeCode settlementReason) {
		this.settlementReason = settlementReason;
	}

	public DeliveryReceiptTypeCode getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(DeliveryReceiptTypeCode settlementType) {
		this.settlementType = settlementType;
	}
}