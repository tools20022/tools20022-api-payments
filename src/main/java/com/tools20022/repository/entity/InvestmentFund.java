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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.FundLegalFormCode;
import com.tools20022.repository.codeset.FundStructureCode;
import com.tools20022.repository.datatype.BICNonFIIdentifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Distinct pool of financial instruments managed by a single investment policy.
 * May or not be part of an umbrella fund. The pool is issued in at least one
 * investment fund class.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="InvestmentFund" src="doc-files/InvestmentFund.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#DomicileCountry
 * InvestmentFund.DomicileCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#OrderDesk
 * InvestmentFund.OrderDesk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#InvestmentFundClass
 * InvestmentFund.InvestmentFundClass}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#FundType
 * InvestmentFund.FundType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#TreasuryTradingParty
 * InvestmentFund.TreasuryTradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#Identification
 * InvestmentFund.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#Custodian
 * InvestmentFund.Custodian}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#PartyRole
 * InvestmentFund.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#Family
 * InvestmentFund.Family}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#Structure
 * InvestmentFund.Structure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#LegalForm
 * InvestmentFund.LegalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#SubFundIndicator
 * InvestmentFund.SubFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#EndOfFiscalYear
 * InvestmentFund.EndOfFiscalYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#AccountingYearEndDate
 * InvestmentFund.AccountingYearEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#FirstAccountingYearEndDate
 * InvestmentFund.FirstAccountingYearEndDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#UmbrellaFund
 * InvestmentFund.UmbrellaFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#AuthorisedCountry
 * InvestmentFund.AuthorisedCountry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFund
 * InvestmentFundClass.InvestmentFund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UmbrellaFund#SubFund
 * UmbrellaFund.SubFund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#DomiciledFunds
 * Country.DomiciledFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedInvestmentFund
 * ContactPoint.RelatedInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#InvestmentFund
 * InvestmentFundFamily.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#InvestmentFund
 * InvestmentFundPartyRole.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#InvestmentFund
 * TreasuryTradingParty.InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CustodianRole#InvestmentFund
 * CustodianRole.InvestmentFund}</li>
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
 * "InvestmentFund"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund. The pool is issued in at least one investment fund class."
 * </li>
 * </ul>
 */
public class InvestmentFund {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Country in which the investment fund is domiciled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#DomiciledFunds
	 * Country.DomiciledFunds}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DomicileCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the investment fund is domiciled."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DomicileCountry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DomicileCountry";
			definition = "Country in which the investment fund is domiciled.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.DomiciledFunds;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Entity appointed by the fund, to which orders should be submitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedInvestmentFund
	 * ContactPoint.RelatedInvestmentFund}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDesk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the fund, to which orders should be submitted."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd OrderDesk = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OrderDesk";
			definition = "Entity appointed by the fund, to which orders should be submitted.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedInvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Sub-set of an investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#InvestmentFund
	 * InvestmentFundClass.InvestmentFund}</li>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-set of an investment fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Sub-set of an investment fund.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FundType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FundType";
			definition = "Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Party which executes a treasury trade on behalf of an investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#InvestmentFund
	 * TreasuryTradingParty.InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty
	 * TreasuryTradingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryTradingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which executes a treasury trade on behalf of an investment fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TreasuryTradingParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TreasuryTradingParty";
			definition = "Party which executes a treasury trade on behalf of an investment fund.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of the investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICNonFIIdentifier
	 * BICNonFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the investment fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the investment fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}
	};
	/**
	 * Party which settles the trades for the account of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CustodianRole#InvestmentFund
	 * CustodianRole.InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CustodianRole
	 * CustodianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party which settles the trades for the account of the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Custodian = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custodian";
			definition = "Party which settles the trades for the account of the fund.";
			minOccurs = 0;
			type_lazy = () -> CustodianRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CustodianRole.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to an investment fund and played by a party in
	 * that context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#InvestmentFund
	 * InvestmentFundPartyRole.InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole
	 * InvestmentFundPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to an investment fund and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an investment fund and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> InvestmentFundPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Family to which the investment fund belongs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#InvestmentFund
	 * InvestmentFundFamily.InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily
	 * InvestmentFundFamily}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Family"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Family to which the investment fund belongs."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Family = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Family";
			definition = "Family to which the investment fund belongs.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundFamily.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundFamily.InvestmentFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Structure of the subfund, eg, single fund, multi-class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundStructureCode
	 * FundStructureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Structure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Structure of the subfund, eg, single fund, multi-class."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Structure = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Structure";
			definition = "Structure of the subfund, eg, single fund, multi-class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FundStructureCode.mmObject();
		}
	};
	/**
	 * Legal form of a fund, eg, corporation or trust.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundLegalFormCode
	 * FundLegalFormCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal form of a fund, eg, corporation or trust."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute LegalForm = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegalForm";
			definition = "Legal form of a fund, eg, corporation or trust.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FundLegalFormCode.mmObject();
		}
	};
	/**
	 * Indicates whether the investment fund is a subfund, when it is a
	 * compartment of an umbrella fund. In this case, subfund is a synonym of
	 * investment fund and therefore has the same attributes as investment fund.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubFundIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investment fund is a subfund, when it is a compartment of an umbrella fund. In this case, subfund is a synonym of investment fund and therefore has the same attributes as investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubFundIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubFundIndicator";
			definition = "Indicates whether the investment fund is a subfund, when it is a compartment of an umbrella fund. In this case, subfund is a synonym of investment fund and therefore has the same attributes as investment fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Date at which the books are closed and profit and loss is determined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfFiscalYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the books are closed and profit and loss is determined."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EndOfFiscalYear = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EndOfFiscalYear";
			definition = "Date at which the books are closed and profit and loss is determined.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Last day of the accounting year for the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingYearEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day of the accounting year for the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AccountingYearEndDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AccountingYearEndDate";
			definition = "Last day of the accounting year for the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Last day of the first accounting year for the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAccountingYearEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last day of the first accounting year for the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FirstAccountingYearEndDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FirstAccountingYearEndDate";
			definition = "Last day of the first accounting year for the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Umbrella fund for which compartments are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UmbrellaFund#SubFund
	 * UmbrellaFund.SubFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.UmbrellaFund
	 * UmbrellaFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UmbrellaFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Umbrella fund for which compartments are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd UmbrellaFund = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UmbrellaFund";
			definition = "Umbrella fund for which compartments are specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.UmbrellaFund.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.UmbrellaFund.SubFund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Country in which it is authorised to commercialise the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund
	 * InvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which it is authorised to commercialise the fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AuthorisedCountry = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> InvestmentFund.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedCountry";
			definition = "Country in which it is authorised to commercialise the fund.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentFund";
				definition = "Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund. The pool is issued in at least one investment fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.InvestmentFund, com.tools20022.repository.entity.UmbrellaFund.SubFund,
						com.tools20022.repository.entity.Country.DomiciledFunds, com.tools20022.repository.entity.ContactPoint.RelatedInvestmentFund, com.tools20022.repository.entity.InvestmentFundFamily.InvestmentFund,
						com.tools20022.repository.entity.InvestmentFundPartyRole.InvestmentFund, com.tools20022.repository.entity.TreasuryTradingParty.InvestmentFund, com.tools20022.repository.entity.CustodianRole.InvestmentFund);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.DomicileCountry, com.tools20022.repository.entity.InvestmentFund.OrderDesk,
						com.tools20022.repository.entity.InvestmentFund.InvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.FundType, com.tools20022.repository.entity.InvestmentFund.TreasuryTradingParty,
						com.tools20022.repository.entity.InvestmentFund.Identification, com.tools20022.repository.entity.InvestmentFund.Custodian, com.tools20022.repository.entity.InvestmentFund.PartyRole,
						com.tools20022.repository.entity.InvestmentFund.Family, com.tools20022.repository.entity.InvestmentFund.Structure, com.tools20022.repository.entity.InvestmentFund.LegalForm,
						com.tools20022.repository.entity.InvestmentFund.SubFundIndicator, com.tools20022.repository.entity.InvestmentFund.EndOfFiscalYear, com.tools20022.repository.entity.InvestmentFund.AccountingYearEndDate,
						com.tools20022.repository.entity.InvestmentFund.FirstAccountingYearEndDate, com.tools20022.repository.entity.InvestmentFund.UmbrellaFund, com.tools20022.repository.entity.InvestmentFund.AuthorisedCountry);
			}
		});
		return mmObject_lazy.get();
	}
}