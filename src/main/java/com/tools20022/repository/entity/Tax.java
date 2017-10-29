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
import com.tools20022.repository.choice.BillingMethod1Choice;
import com.tools20022.repository.choice.TaxAmountType1Choice;
import com.tools20022.repository.choice.TaxExemptionReasonFormatChoice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Tax" src="doc-files/Tax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#ExemptionReason
 * Tax.ExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Country Tax.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#TaxLiabilityValueCalculation
 * Tax.TaxLiabilityValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Type Tax.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Amount Tax.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Rate Tax.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxableParty
 * Tax.TaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#TaxRefundValueCalculation
 * Tax.TaxRefundValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Basis Tax.Basis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#SecuritiesTransfer
 * Tax.SecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxRateType
 * Tax.TaxRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxAccount
 * Tax.TaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxationConditions
 * Tax.TaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Adjustment
 * Tax.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Interest Tax.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Identification
 * Tax.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#RelatedPaymentSettlement
 * Tax.RelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxableBaseAmount
 * Tax.TaxableBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxDate Tax.TaxDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#CertificateIdentification
 * Tax.CertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#AdministrationZone
 * Tax.AdministrationZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Method Tax.Method}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Record Tax.Record}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Product Tax.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CurrencyExchange
 * Tax.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Currency Tax.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#PartyRole Tax.PartyRole}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxDeduction
 * Tax.TaxDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#RelatedCorporateActionDistribution
 * Tax.RelatedCorporateActionDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CalculationDate
 * Tax.CalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Dividend Tax.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#WithholdingTaxType
 * Tax.WithholdingTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CorporateActionEvent
 * Tax.CorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxIdentificationType
 * Tax.TaxIdentificationType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Tax Country.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Tax Dividend.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxLiability
 * NetAssetValueCalculation.TaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxRefund
 * NetAssetValueCalculation.TaxRefund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#TaxationConditions
 * Party.TaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Tax
 * CashAccount.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Tax Product.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Tax
 * Adjustment.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
 * Payment.TaxOnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferTax
 * SecuritiesTransfer.TransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestTax
 * Interest.InterestTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Tax
 * CurrencyExchange.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TransactionTax
 * CorporateActionEvent.TransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole#Tax
 * TaxPartyRole.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#Tax TaxRecord.Tax}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#DistributionTax
 * Distribution.DistributionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxParty3#TaxExemptionReason
 * TaxParty3.TaxExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax1#Rate
 * BillingServicesTax1.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax2#Rate
 * BillingServicesTax2.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodA
 * BillingMethod1Choice.MethodA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodB
 * BillingMethod1Choice.MethodB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodD
 * BillingMethod1Choice.MethodD}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax3#Rate
 * BillingServicesTax3.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4#TaxCalculation
 * BillingMethod4.TaxCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#MethodC
 * BillingTaxRegion1.MethodC}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice
 * TaxExemptionReasonFormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2 TaxCharges2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecordDetails1
 * TaxRecordDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1 TaxAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3
 * TaxInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxAmountType1Choice
 * TaxAmountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1
 * TaxAmountAndType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReason1 TaxReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1 BillingMethod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod2 BillingMethod2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod3 BillingMethod3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BillingMethod1Choice
 * BillingMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1
 * TaxCalculation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4 BillingMethod4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1
 * BillingTaxRegion1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4
 * TaxInformation4}</li>
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
 * "Tax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reason for a tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#Unstructured
	 * TaxExemptionReasonFormatChoice.Unstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#Structured
	 * TaxExemptionReasonFormatChoice.Structured}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExemptionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TaxExemptionReasonFormatChoice.Unstructured, com.tools20022.repository.choice.TaxExemptionReasonFormatChoice.Structured);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxExemptReasonCode.mmObject();
		}
	};
	/**
	 * Place of taxation of an individual person or an organisation, where the
	 * tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#Tax
	 * Country.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of taxation of an individual person or an organisation, where the tax is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Place of taxation of an individual person or an organisation, where the tax is due.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation for which tax liability information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxLiability
	 * NetAssetValueCalculation.TaxLiability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiabilityValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax liability information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxLiabilityValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxLiabilityValueCalculation";
			definition = "Net asset value calculation for which tax liability information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TaxTypeCode
	 * TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#Code
	 * TaxAmountType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#Proprietary
	 * TaxAmountType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1#Type
	 * TaxAmountAndType1.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TaxAmountType1Choice.Code, com.tools20022.repository.choice.TaxAmountType1Choice.Proprietary, com.tools20022.repository.msg.TaxAmountAndType1.Type);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxTypeCode.mmObject();
		}
	};
	/**
	 * Amount of money resulting from the calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#Amount
	 * TaxCharges2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxRecordDetails1#Amount
	 * TaxRecordDetails1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1#TotalAmount
	 * TaxAmount1.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#TotalTaxAmount
	 * TaxInformation3.TotalTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1#Amount
	 * TaxAmountAndType1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1#ServiceChargeHostAmount
	 * BillingMethod1.ServiceChargeHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2#ServiceChargeHostAmount
	 * BillingMethod2.ServiceChargeHostAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServicesTax3#TotalTaxAmount
	 * BillingServicesTax3.TotalTaxAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1#TotalTax
	 * TaxCalculation1.TotalTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#SettlementAmount
	 * BillingTaxRegion1.SettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#TaxDueToRegion
	 * BillingTaxRegion1.TaxDueToRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#TotalTaxAmount
	 * TaxInformation4.TotalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount3#TaxAmount
	 * RemittanceAmount3.TaxAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCharges2.Amount, com.tools20022.repository.msg.TaxRecordDetails1.Amount, com.tools20022.repository.msg.TaxAmount1.TotalAmount,
					com.tools20022.repository.msg.TaxInformation3.TotalTaxAmount, com.tools20022.repository.msg.TaxAmountAndType1.Amount, com.tools20022.repository.msg.BillingMethod1.ServiceChargeHostAmount,
					com.tools20022.repository.msg.BillingMethod2.ServiceChargeHostAmount, com.tools20022.repository.msg.BillingServicesTax3.TotalTaxAmount, com.tools20022.repository.msg.TaxCalculation1.TotalTax,
					com.tools20022.repository.msg.BillingTaxRegion1.SettlementAmount, com.tools20022.repository.msg.BillingTaxRegion1.TaxDueToRegion, com.tools20022.repository.msg.TaxInformation4.TotalTaxAmount,
					com.tools20022.repository.msg.RemittanceAmount3.TaxAmount);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Rate used for calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#Rate
	 * TaxCharges2.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1#Rate
	 * TaxAmount1.Rate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCharges2.Rate, com.tools20022.repository.msg.TaxAmount1.Rate);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Party which is taxable at a specific location
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#TaxationConditions
	 * Party.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is taxable at a specific location"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxableParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.TaxationConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation for which tax refund information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxRefund
	 * NetAssetValueCalculation.TaxRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefundValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax refund information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxRefundValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRefundValueCalculation";
			definition = "Net asset value calculation for which tax refund information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Basis used to determine the capital gain or loss, eg, the purchase price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Basis = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	/**
	 * Transfer process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferTax
	 * SecuritiesTransfer.TransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process for which a tax is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.TransferTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RateTypeCode
	 * RateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxRateType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRateType";
			definition = "Specifies the type of tax rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RateTypeCode.mmObject();
		}
	};
	/**
	 * Account to be used for taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.CashAccount#Tax
	 * CashAccount.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to be used for taxes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TaxAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies other taxation conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies other taxation conditions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxationConditions = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Specifies other taxation conditions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the adjustments subject to a tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Adjustment#Tax
	 * Adjustment.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the adjustments subject to a tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments subject to a tax.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestTax
	 * Interest.InterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest for which a tax is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Reference used to identify the nature of tax levied, such as Value Added
	 * Tax (VAT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#Identification
	 * TaxCharges2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#ReferenceNumber
	 * TaxInformation3.ReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#ReferenceNumber
	 * Garnishment1.ReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#ReferenceNumber
	 * TaxInformation4.ReferenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCharges2.Identification, com.tools20022.repository.msg.TaxInformation3.ReferenceNumber, com.tools20022.repository.msg.Garnishment1.ReferenceNumber,
					com.tools20022.repository.msg.TaxInformation4.ReferenceNumber);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment to which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
	 * Payment.TaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment to which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPaymentSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentSettlement";
			definition = "Payment to which the tax applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.TaxOnPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money on which the tax is based.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxAmount1#TaxableBaseAmount
	 * TaxAmount1.TaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#TotalTaxableBaseAmount
	 * TaxInformation3.TotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#TotalTaxableBaseAmount
	 * TaxInformation4.TotalTaxableBaseAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableBaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money on which the tax is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxableBaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxAmount1.TaxableBaseAmount, com.tools20022.repository.msg.TaxInformation3.TotalTaxableBaseAmount,
					com.tools20022.repository.msg.TaxInformation4.TotalTaxableBaseAmount);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date by which tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#Date
	 * TaxInformation3.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#PointDate
	 * BillingTaxRegion1.PointDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#Date
	 * TaxInformation4.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which tax is due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Date, com.tools20022.repository.msg.BillingTaxRegion1.PointDate, com.tools20022.repository.msg.TaxInformation4.Date);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Document issued by taxing authority identifying the tax payer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxRecord1#CertificateIdentification
	 * TaxRecord1.CertificateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document issued by taxing authority identifying the tax payer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CertificateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxRecord1.CertificateIdentification);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateIdentification";
			definition = "Document issued by taxing authority identifying the tax payer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Territorial part of a country to which the tax payment is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#AdministrationZone
	 * TaxInformation3.AdministrationZone}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#Region
	 * AccountTax1.Region}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#Region
	 * ServiceTaxDesignation1.Region}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#RegionName
	 * BillingTaxRegion1.RegionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#AdministrationZone
	 * TaxInformation4.AdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#TaxRegion
	 * BillingStatement2.TaxRegion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrationZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Territorial part of a country to which the tax payment is related."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdministrationZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.AdministrationZone, com.tools20022.repository.msg.AccountTax1.Region, com.tools20022.repository.msg.ServiceTaxDesignation1.Region,
					com.tools20022.repository.msg.BillingTaxRegion1.RegionName, com.tools20022.repository.msg.TaxInformation4.AdministrationZone, com.tools20022.repository.msg.BillingStatement2.TaxRegion);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#Method
	 * TaxInformation3.Method}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#Method
	 * TaxInformation4.Method}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to indicate the underlying business or how the tax is paid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Method = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Method, com.tools20022.repository.msg.TaxInformation4.Method);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Record of tax details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.TaxRecord#Tax
	 * TaxRecord.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#Record
	 * TaxInformation3.Record}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1#TaxIdentification
	 * BillingMethod1.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2#TaxIdentification
	 * BillingMethod2.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod3#TaxIdentification
	 * BillingMethod3.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#TaxIdentification
	 * TaxCalculation1.TaxIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#Record
	 * TaxInformation4.Record}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#TaxDesignation
	 * BillingService2.TaxDesignation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of tax details."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Record = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Record, com.tools20022.repository.msg.BillingMethod1.TaxIdentification, com.tools20022.repository.msg.BillingMethod2.TaxIdentification,
					com.tools20022.repository.msg.BillingMethod3.TaxIdentification, com.tools20022.repository.msg.TaxCalculation1.TaxIdentification, com.tools20022.repository.msg.TaxInformation4.Record,
					com.tools20022.repository.msg.BillingService2.TaxDesignation);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 1;
			type_lazy = () -> TaxRecord.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product on which a tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#Tax
	 * Product.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product on which a tax is applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product on which a tax is applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency exchange applicable to a tax
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#Tax
	 * CurrencyExchange.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to a tax"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange applicable to a tax";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency in which the tax must be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#HostCurrency
	 * TaxCalculation1.HostCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#HostCurrencyCode
	 * CashAccountCharacteristics2.HostCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the tax must be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculation1.HostCurrency, com.tools20022.repository.msg.CashAccountCharacteristics2.HostCurrencyCode);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the tax must be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a tax and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#Tax
	 * TaxPartyRole.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
	 * TaxPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#SendingFinancialInstitution
	 * BillingTaxRegion1.SendingFinancialInstitution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a tax and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingTaxRegion1.SendingFinancialInstitution);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a tax and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> TaxPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of tax that have been previously deducted.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax that have been previously deducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxDeduction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Distribution process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#DistributionTax
	 * Distribution.DistributionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionDistribution";
			definition = "Distribution process for which a tax is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.DistributionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the tax is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the tax is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date on which the tax is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Dividend for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Dividend#Tax
	 * Dividend.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend for which a tax is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of withholding tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of withholding tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute WithholdingTaxType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxType";
			definition = "Type of withholding tax rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
		}
	};
	/**
	 * Event for which a transaction tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TransactionTax
	 * CorporateActionEvent.TransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event for which a transaction tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEvent";
			definition = "Event for which a transaction tax is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.TransactionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of tax identification number or identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode
	 * TaxIdentificationNumberTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax identification number or identifier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TaxIdentificationType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationType";
			definition = "Type of tax identification number or identifier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Tax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Tax, com.tools20022.repository.entity.Dividend.Tax, com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund, com.tools20022.repository.entity.Party.TaxationConditions, com.tools20022.repository.entity.CashAccount.Tax,
						com.tools20022.repository.entity.Product.Tax, com.tools20022.repository.entity.Adjustment.Tax, com.tools20022.repository.entity.Payment.TaxOnPayment, com.tools20022.repository.entity.SecuritiesTransfer.TransferTax,
						com.tools20022.repository.entity.Interest.InterestTax, com.tools20022.repository.entity.CurrencyExchange.Tax, com.tools20022.repository.entity.CorporateActionEvent.TransactionTax,
						com.tools20022.repository.entity.TaxPartyRole.Tax, com.tools20022.repository.entity.TaxRecord.Tax, com.tools20022.repository.entity.Distribution.DistributionTax);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxParty3.TaxExemptionReason, com.tools20022.repository.msg.BillingServicesTax1.Rate, com.tools20022.repository.msg.BillingServicesTax2.Rate,
						com.tools20022.repository.choice.BillingMethod1Choice.MethodA, com.tools20022.repository.choice.BillingMethod1Choice.MethodB, com.tools20022.repository.choice.BillingMethod1Choice.MethodD,
						com.tools20022.repository.msg.BillingServicesTax3.Rate, com.tools20022.repository.msg.BillingMethod4.TaxCalculation, com.tools20022.repository.msg.BillingTaxRegion1.MethodC);
				subType_lazy = () -> Arrays.asList(SecuritiesTax.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.ExemptionReason, com.tools20022.repository.entity.Tax.Country, com.tools20022.repository.entity.Tax.TaxLiabilityValueCalculation,
						com.tools20022.repository.entity.Tax.Type, com.tools20022.repository.entity.Tax.Amount, com.tools20022.repository.entity.Tax.Rate, com.tools20022.repository.entity.Tax.TaxableParty,
						com.tools20022.repository.entity.Tax.TaxRefundValueCalculation, com.tools20022.repository.entity.Tax.Basis, com.tools20022.repository.entity.Tax.SecuritiesTransfer, com.tools20022.repository.entity.Tax.TaxRateType,
						com.tools20022.repository.entity.Tax.TaxAccount, com.tools20022.repository.entity.Tax.TaxationConditions, com.tools20022.repository.entity.Tax.Adjustment, com.tools20022.repository.entity.Tax.Interest,
						com.tools20022.repository.entity.Tax.Identification, com.tools20022.repository.entity.Tax.RelatedPaymentSettlement, com.tools20022.repository.entity.Tax.TaxableBaseAmount,
						com.tools20022.repository.entity.Tax.TaxDate, com.tools20022.repository.entity.Tax.CertificateIdentification, com.tools20022.repository.entity.Tax.AdministrationZone, com.tools20022.repository.entity.Tax.Method,
						com.tools20022.repository.entity.Tax.Record, com.tools20022.repository.entity.Tax.Product, com.tools20022.repository.entity.Tax.CurrencyExchange, com.tools20022.repository.entity.Tax.Currency,
						com.tools20022.repository.entity.Tax.PartyRole, com.tools20022.repository.entity.Tax.TaxDeduction, com.tools20022.repository.entity.Tax.RelatedCorporateActionDistribution,
						com.tools20022.repository.entity.Tax.CalculationDate, com.tools20022.repository.entity.Tax.Dividend, com.tools20022.repository.entity.Tax.WithholdingTaxType,
						com.tools20022.repository.entity.Tax.CorporateActionEvent, com.tools20022.repository.entity.Tax.TaxIdentificationType);
				derivationComponent_lazy = () -> Arrays.asList(TaxExemptionReasonFormatChoice.mmObject(), TaxCharges2.mmObject(), TaxRecordDetails1.mmObject(), TaxAmount1.mmObject(), TaxInformation3.mmObject(),
						TaxAmountType1Choice.mmObject(), TaxAmountAndType1.mmObject(), AccountTax1.mmObject(), TaxReason1.mmObject(), BillingMethod1.mmObject(), BillingMethod2.mmObject(), BillingMethod3.mmObject(),
						BillingMethod1Choice.mmObject(), TaxCalculation1.mmObject(), BillingMethod4.mmObject(), BillingTaxRegion1.mmObject(), TaxInformation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}