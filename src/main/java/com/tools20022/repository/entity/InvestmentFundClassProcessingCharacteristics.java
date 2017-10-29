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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Processing characteristics linked to the instrument, ie, not to the market.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFundClassProcessingCharacteristics"
 * src="doc-files/InvestmentFundClassProcessingCharacteristics.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#ReinvestmentFrequency
 * InvestmentFundClassProcessingCharacteristics.ReinvestmentFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#FrontEndLoadIndicator
 * InvestmentFundClassProcessingCharacteristics.FrontEndLoadIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#BackEndLoadIndicator
 * InvestmentFundClassProcessingCharacteristics.BackEndLoadIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SwitchingFeeIndicator
 * InvestmentFundClassProcessingCharacteristics.SwitchingFeeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#LimitedSubscriptionPeriod
 * InvestmentFundClassProcessingCharacteristics.LimitedSubscriptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#LimitedRedemptionPeriod
 * InvestmentFundClassProcessingCharacteristics.LimitedRedemptionPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#Decimalisation
 * InvestmentFundClassProcessingCharacteristics.Decimalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#HoldingTransferableIndicator
 * InvestmentFundClassProcessingCharacteristics.HoldingTransferableIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#ApplicationForm
 * InvestmentFundClassProcessingCharacteristics.ApplicationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SignatureRequired
 * InvestmentFundClassProcessingCharacteristics.SignatureRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#AmountIndicator
 * InvestmentFundClassProcessingCharacteristics.AmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#UnitsIndicator
 * InvestmentFundClassProcessingCharacteristics.UnitsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#OrderCutOffDateTime
 * InvestmentFundClassProcessingCharacteristics.OrderCutOffDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementCycle
 * InvestmentFundClassProcessingCharacteristics.SettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#FundClass
 * InvestmentFundClassProcessingCharacteristics.FundClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#HoldingTransferable
 * InvestmentFundClassProcessingCharacteristics.HoldingTransferable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#DealingFrequency
 * InvestmentFundClassProcessingCharacteristics.DealingFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#LimitedPeriod
 * InvestmentFundClassProcessingCharacteristics.LimitedPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SettlementAccount
 * InvestmentFundClassProcessingCharacteristics.SettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#Country
 * InvestmentFundClassProcessingCharacteristics.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#LocalMarketAnnex
 * InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#EffectiveDate
 * InvestmentFundClassProcessingCharacteristics.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#SubsequentSubscriptionApplicationForm
 * InvestmentFundClassProcessingCharacteristics.
 * SubsequentSubscriptionApplicationForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#RedemptionForm
 * InvestmentFundClassProcessingCharacteristics.RedemptionForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#DealingCurrency
 * InvestmentFundClassProcessingCharacteristics.DealingCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#DealingCutOffTimeFrame
 * InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumHoldingAmount
 * InvestmentFundClassProcessingCharacteristics.MinimumHoldingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MaximumRedemptionUnits
 * InvestmentFundClassProcessingCharacteristics.MaximumRedemptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumHoldingUnits
 * InvestmentFundClassProcessingCharacteristics.MinimumHoldingUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumRemainingHoldingAmount
 * InvestmentFundClassProcessingCharacteristics.MinimumRemainingHoldingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MaximumRedemptionPercentage
 * InvestmentFundClassProcessingCharacteristics.MaximumRedemptionPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MaximumRedemptionAmount
 * InvestmentFundClassProcessingCharacteristics.MaximumRedemptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumInitialSubscriptionUnits
 * InvestmentFundClassProcessingCharacteristics.MinimumInitialSubscriptionUnits}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumSubscriptionAmount
 * InvestmentFundClassProcessingCharacteristics.MinimumSubscriptionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumInitialSubscriptionAmount
 * InvestmentFundClassProcessingCharacteristics.MinimumInitialSubscriptionAmount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumSubscriptionUnits
 * InvestmentFundClassProcessingCharacteristics.MinimumSubscriptionUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#MinimumHoldingPeriod
 * InvestmentFundClassProcessingCharacteristics.MinimumHoldingPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#ProcessingCharacteristics
 * InvestmentFundClass.ProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryRelatedInvestmentFundProcessing
 * Country.CountryRelatedInvestmentFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#InvestmentFundClassProcessing
 * ContactPoint.InvestmentFundClassProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#SubscriptionSettlementRelatedFundProcessing
 * TimeFrame.SubscriptionSettlementRelatedFundProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TimeFrame#RelatedProcessingCharacteristics
 * TimeFrame.RelatedProcessingCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Account#RelatedFundProcessingCharacteristics
 * Account.RelatedFundProcessingCharacteristics}</li>
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
 * "InvestmentFundClassProcessingCharacteristics"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Processing characteristics linked to the instrument, ie, not to  the market."
 * </li>
 * </ul>
 */
public class InvestmentFundClassProcessingCharacteristics {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Frequency with which the reinvestment takes place, This is the same or
	 * less than the dividend frequency,
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the reinvestment takes place,  This is the same or less than the dividend frequency,"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReinvestmentFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentFrequency";
			definition = "Frequency with which the reinvestment takes place,  This is the same or less than the dividend frequency,";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Front end charge on subscription orders for this class can be applied.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndLoadIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Front end charge on subscription orders for this class can be applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FrontEndLoadIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndLoadIndicator";
			definition = "Front end charge on subscription orders for this class can be applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Exit charge (eg. CDSC) on redemption orders for this class can be
	 * applied.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndLoadIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exit charge (eg. CDSC) on redemption orders for this class can be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BackEndLoadIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndLoadIndicator";
			definition = "Exit charge (eg. CDSC) on redemption orders for this class can be applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * If a separate fee for switching between sub-funds of the same umbrella
	 * can be applied.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchingFeeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If a separate fee for switching between sub-funds of the same umbrella can be applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SwitchingFeeIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SwitchingFeeIndicator";
			definition = "If a separate fee for switching between sub-funds of the same umbrella can be applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be subscribed to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedSubscriptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LimitedSubscriptionPeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedSubscriptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be subscribed to.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedRedemptionPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LimitedRedemptionPeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedRedemptionPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Number of decimal places to which quantities of units/shares are rounded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decimalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of decimal places to which quantities of units/shares are rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Decimalisation = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Decimalisation";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Indicates whether registered investors are able to transfer some or all
	 * of their holdings to third parties.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingTransferableIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether registered investors are able to transfer some or all of their holdings to third parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingTransferableIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingTransferableIndicator";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Physical application form is required.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical application form is required."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicationForm = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationForm";
			definition = "Physical application form is required.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies which type of signature is required when completing an initial
	 * subscription, when completing a subsequent subscription, and when
	 * completing redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureTypeCode
	 * SignatureTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which type of signature is required when completing an initial subscription, when completing a subsequent subscription, and when completing redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SignatureRequired = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SignatureRequired";
			definition = "Specifies which type of signature is required when completing an initial subscription, when completing a subsequent subscription, and when completing redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SignatureTypeCode.mmObject();
		}
	};
	/**
	 * Indicates whether subscriptions/redemption in amount are allowed.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether subscriptions/redemption in amount are allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AmountIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AmountIndicator";
			definition = "Indicates whether subscriptions/redemption in amount are allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether subsciptions/redemption may be placed as a number of
	 * units.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether subsciptions/redemption may be placed as a number of units."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnitsIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitsIndicator";
			definition = "Indicates whether subsciptions/redemption may be placed as a number of units.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Last date/time at which an order to subscribe or an order to redeem can
	 * be given.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderCutOffDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last date/time at which an order to subscribe or an order to redeem can be given."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OrderCutOffDateTime = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderCutOffDateTime";
			definition = "Last date/time at which an order to subscribe or an order to redeem can be given.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * An agreed number of days after the Trade date (T) used to define standard
	 * timeframes e.g T+3 settlement period <br>
	 * Where T = the date the price is applied to a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#SubscriptionSettlementRelatedFundProcessing
	 * TimeFrame.SubscriptionSettlementRelatedFundProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period \r\nWhere T = the date the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementCycle = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementCycle";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period \r\nWhere T = the date the price is applied to a transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TimeFrame.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TimeFrame.SubscriptionSettlementRelatedFundProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment fund class for which processing characteristics are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#ProcessingCharacteristics
	 * InvestmentFundClass.ProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment fund class for which processing characteristics are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FundClass = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundClass";
			definition = "Investment fund class for which processing characteristics are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.ProcessingCharacteristics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether registered investors are able to transfer some or all
	 * of their holdings to third parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingTransferableCode
	 * HoldingTransferableCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingTransferable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether registered investors are able to transfer some or all of their holdings to third parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute HoldingTransferable = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "HoldingTransferable";
			definition = "Indicates whether registered investors are able to transfer some or all of their holdings to third parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> HoldingTransferableCode.mmObject();
		}
	};
	/**
	 * Frequency at which the subscriptions and redemptions are done.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency at which the subscriptions and redemptions are done."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DealingFrequency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealingFrequency";
			definition = "Frequency at which the subscriptions and redemptions are done.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specific period, eg, for some guaranteed funds, during which the
	 * units/shares may be redeemed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LimitedPeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LimitedPeriod";
			definition = "Specific period, eg, for some guaranteed funds, during which the units/shares may be redeemed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Account used for settlement of fund transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#RelatedFundProcessingCharacteristics
	 * Account.RelatedFundProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account used for settlement of fund transactions."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SettlementAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementAccount";
			definition = "Account used for settlement of fund transactions.";
			minOccurs = 0;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.RelatedFundProcessingCharacteristics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country in which the processing characteristic applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#CountryRelatedInvestmentFundProcessing
	 * Country.CountryRelatedInvestmentFundProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the processing characteristic applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country in which the processing characteristic applies.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.CountryRelatedInvestmentFundProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Context, or geographic environment, in which trading parties may meet in
	 * order to negotiate and execute trades among themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#InvestmentFundClassProcessing
	 * ContactPoint.InvestmentFundClassProcessing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalMarketAnnex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LocalMarketAnnex = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LocalMarketAnnex";
			definition = "Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.InvestmentFundClassProcessing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date/time as from which the processing characteristics are valid.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which the processing characteristics are valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Date/time as from which the processing characteristics are valid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Physical application form for subsequent investments by the same
	 * investor.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubsequentSubscriptionApplicationForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical application form for subsequent investments by the same investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubsequentSubscriptionApplicationForm = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubsequentSubscriptionApplicationForm";
			definition = "Physical application form for subsequent investments by the same investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Physical written instruction/renunciation form for redemption of
	 * units/shares by the investor.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical written instruction/renunciation form for redemption of units/shares by the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RedemptionForm = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionForm";
			definition = "Physical written instruction/renunciation form for redemption of units/shares by the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Currency in which a subscription or redemption is accepted.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which a subscription or redemption is accepted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute DealingCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealingCurrency";
			definition = "Currency in which a subscription or redemption is accepted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the number of days for cut off before or after an activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#RelatedProcessingCharacteristics
	 * TimeFrame.RelatedProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingCutOffTimeFrame"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days for cut off before or after an activity."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DealingCutOffTimeFrame = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DealingCutOffTimeFrame";
			definition = "Specifies the number of days for cut off before or after an activity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TimeFrame.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TimeFrame.RelatedProcessingCharacteristics;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum value of units that must be maintained to avoid automatic
	 * redemption.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum value of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumHoldingAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingAmount";
			definition = "Minimum value of units that must be maintained to avoid automatic redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum number of shares/units that may be redeemed on a single dealing
	 * day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of shares/units that may be redeemed on a single dealing day."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumRedemptionUnits = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionUnits";
			definition = "Maximum number of shares/units that may be redeemed on a single dealing day.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Minimum number of units that must be maintained to avoid automatic
	 * redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of units that must be maintained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumHoldingUnits = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingUnits";
			definition = "Minimum number of units that must be maintained to avoid automatic redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Minimum value of units/shares that must be retained to avoid automatic
	 * redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRemainingHoldingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum value of units/shares that must be retained to avoid automatic redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumRemainingHoldingAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumRemainingHoldingAmount";
			definition = "Minimum value of units/shares that must be retained to avoid automatic redemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum quantity of securities, expressed as a percentage that can be
	 * sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity of securities, expressed as a percentage that can be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumRedemptionPercentage = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionPercentage";
			definition = "Maximum quantity of securities, expressed as a percentage that can be sold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Maximum quantity of securities, expressed as an amount that can be sold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum quantity of securities, expressed as an amount that can be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumRedemptionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumRedemptionAmount";
			definition = "Maximum quantity of securities, expressed as an amount that can be sold.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum initial number of units/shares that must be purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial number of units/shares that must be purchased."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumInitialSubscriptionUnits = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInitialSubscriptionUnits";
			definition = "Minimum initial number of units/shares that must be purchased.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Minimum quantity of securities, expressed as an amount that must be
	 * purchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as an amount that must be purchased."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumSubscriptionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSubscriptionAmount";
			definition = "Minimum quantity of securities, expressed as an amount that must be purchased.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum initial quantity of securities, expressed as an amount that must
	 * be purchased at subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumInitialSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumInitialSubscriptionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumInitialSubscriptionAmount";
			definition = "Minimum initial quantity of securities, expressed as an amount that must be purchased at subscription.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Minimum number of units/shares that must be purchase by existing
	 * investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSubscriptionUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of units/shares that must be purchase by existing investors."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumSubscriptionUnits = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumSubscriptionUnits";
			definition = "Minimum number of units/shares that must be purchase by existing investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Description of a period, that may be a number of days, weeks or
	 * descriptive period during which the units/shares must be held following
	 * their issue before redemption will be permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics
	 * InvestmentFundClassProcessingCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumHoldingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MinimumHoldingPeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumHoldingPeriod";
			definition = "Description of a period, that may be a number of days, weeks or descriptive period during which the units/shares must be held following their issue before redemption will be permitted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundClassProcessingCharacteristics";
				definition = "Processing characteristics linked to the instrument, ie, not to  the market.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.ProcessingCharacteristics, com.tools20022.repository.entity.Country.CountryRelatedInvestmentFundProcessing,
						com.tools20022.repository.entity.ContactPoint.InvestmentFundClassProcessing, com.tools20022.repository.entity.TimeFrame.SubscriptionSettlementRelatedFundProcessing,
						com.tools20022.repository.entity.TimeFrame.RelatedProcessingCharacteristics, com.tools20022.repository.entity.Account.RelatedFundProcessingCharacteristics);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.ReinvestmentFrequency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FrontEndLoadIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.BackEndLoadIndicator,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SwitchingFeeIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LimitedSubscriptionPeriod,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LimitedRedemptionPeriod, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Decimalisation,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.HoldingTransferableIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.ApplicationForm,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SignatureRequired, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.AmountIndicator,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.UnitsIndicator, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.OrderCutOffDateTime,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementCycle, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.FundClass,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.HoldingTransferable, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingFrequency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LimitedPeriod, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SettlementAccount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.Country, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.LocalMarketAnnex,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.EffectiveDate, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.SubsequentSubscriptionApplicationForm,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.RedemptionForm, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCurrency,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.DealingCutOffTimeFrame, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumHoldingAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MaximumRedemptionUnits, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumHoldingUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumRemainingHoldingAmount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MaximumRedemptionPercentage,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MaximumRedemptionAmount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumInitialSubscriptionUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumSubscriptionAmount,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumInitialSubscriptionAmount, com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumSubscriptionUnits,
						com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics.MinimumHoldingPeriod);
			}
		});
		return mmObject_lazy.get();
	}
}