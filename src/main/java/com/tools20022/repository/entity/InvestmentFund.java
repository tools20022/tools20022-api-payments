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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.FundLegalFormCode;
import com.tools20022.repository.codeset.FundStructureCode;
import com.tools20022.repository.datatype.BICNonFIIdentifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmDomicileCountry
 * InvestmentFund.mmDomicileCountry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmOrderDesk
 * InvestmentFund.mmOrderDesk}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
 * InvestmentFund.mmInvestmentFundClass}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmFundType
 * InvestmentFund.mmFundType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmTreasuryTradingParty
 * InvestmentFund.mmTreasuryTradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmIdentification
 * InvestmentFund.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmCustodian
 * InvestmentFund.mmCustodian}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmPartyRole
 * InvestmentFund.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmFamily
 * InvestmentFund.mmFamily}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmStructure
 * InvestmentFund.mmStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFund#mmLegalForm
 * InvestmentFund.mmLegalForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmSubFundIndicator
 * InvestmentFund.mmSubFundIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmEndOfFiscalYear
 * InvestmentFund.mmEndOfFiscalYear}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmAccountingYearEndDate
 * InvestmentFund.mmAccountingYearEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmFirstAccountingYearEndDate
 * InvestmentFund.mmFirstAccountingYearEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmUmbrellaFund
 * InvestmentFund.mmUmbrellaFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmAuthorisedCountry
 * InvestmentFund.mmAuthorisedCountry}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFund
 * InvestmentFundClass.mmInvestmentFund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UmbrellaFund#mmSubFund
 * UmbrellaFund.mmSubFund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmDomiciledFunds
 * Country.mmDomiciledFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedInvestmentFund
 * ContactPoint.mmRelatedInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#mmInvestmentFund
 * InvestmentFundFamily.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmInvestmentFund
 * InvestmentFundPartyRole.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
 * TreasuryTradingParty.mmInvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CustodianRole#mmInvestmentFund
 * CustodianRole.mmInvestmentFund}</li>
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
	protected Country domicileCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmDomiciledFunds
	 * Country.mmDomiciledFunds}</li>
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
	public static final MMBusinessAssociationEnd mmDomicileCountry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DomicileCountry";
			definition = "Country in which the investment fund is domiciled.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmDomiciledFunds;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> orderDesk;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedInvestmentFund
	 * ContactPoint.mmRelatedInvestmentFund}</li>
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
	public static final MMBusinessAssociationEnd mmOrderDesk = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OrderDesk";
			definition = "Entity appointed by the fund, to which orders should be submitted.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedInvestmentFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFund
	 * InvestmentFundClass.mmInvestmentFund}</li>
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
	public static final MMBusinessAssociationEnd mmInvestmentFundClass = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundClass";
			definition = "Sub-set of an investment fund.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected Max35Text fundType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmFundType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundType";
			definition = "Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getFundType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TreasuryTradingParty treasuryTradingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradingParty#mmInvestmentFund
	 * TreasuryTradingParty.mmInvestmentFund}</li>
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
	public static final MMBusinessAssociationEnd mmTreasuryTradingParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TreasuryTradingParty";
			definition = "Party which executes a treasury trade on behalf of an investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.mmInvestmentFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TreasuryTradingParty.mmObject();
		}
	};
	protected BICNonFIIdentifier identification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of the investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICNonFIIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CustodianRole> custodian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CustodianRole#mmInvestmentFund
	 * CustodianRole.mmInvestmentFund}</li>
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
	public static final MMBusinessAssociationEnd mmCustodian = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custodian";
			definition = "Party which settles the trades for the account of the fund.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CustodianRole.mmInvestmentFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CustodianRole.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.InvestmentFundPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundPartyRole#mmInvestmentFund
	 * InvestmentFundPartyRole.mmInvestmentFund}</li>
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
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to an investment fund and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmInvestmentFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundPartyRole.mmObject();
		}
	};
	protected InvestmentFundFamily family;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#mmInvestmentFund
	 * InvestmentFundFamily.mmInvestmentFund}</li>
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
	public static final MMBusinessAssociationEnd mmFamily = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Family";
			definition = "Family to which the investment fund belongs.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundFamily.mmInvestmentFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundFamily.mmObject();
		}
	};
	protected FundStructureCode structure;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmStructure = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Structure";
			definition = "Structure of the subfund, eg, single fund, multi-class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundStructureCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getStructure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FundLegalFormCode legalForm;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmLegalForm = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LegalForm";
			definition = "Legal form of a fund, eg, corporation or trust.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FundLegalFormCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getLegalForm", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator subFundIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, name=Fund compartment, context=EFAMA</li>
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
	public static final MMBusinessAttribute mmSubFundIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"name", "Fund compartment"}, new String[]{"context", "EFAMA"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubFundIndicator";
			definition = "Indicates whether the investment fund is a subfund, when it is a compartment of an umbrella fund. In this case, subfund is a synonym of investment fund and therefore has the same attributes as investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getSubFundIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate endOfFiscalYear;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmEndOfFiscalYear = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndOfFiscalYear";
			definition = "Date at which the books are closed and profit and loss is determined.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getEndOfFiscalYear", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate accountingYearEndDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmAccountingYearEndDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccountingYearEndDate";
			definition = "Last day of the accounting year for the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getAccountingYearEndDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate firstAccountingYearEndDate;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmFirstAccountingYearEndDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstAccountingYearEndDate";
			definition = "Last day of the first accounting year for the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getFirstAccountingYearEndDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UmbrellaFund umbrellaFund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.UmbrellaFund#mmSubFund
	 * UmbrellaFund.mmSubFund}</li>
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
	public static final MMBusinessAssociationEnd mmUmbrellaFund = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UmbrellaFund";
			definition = "Umbrella fund for which compartments are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.UmbrellaFund.mmSubFund;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.UmbrellaFund.mmObject();
		}
	};
	protected CountryCode authorisedCountry;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmAuthorisedCountry = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.InvestmentFund.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisedCountry";
			definition = "Country in which it is authorised to commercialise the fund.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvestmentFund.class.getMethod("getAuthorisedCountry", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFund";
				definition = "Distinct pool of financial instruments managed by a single investment policy. May or not be part of an umbrella fund. The pool is issued in at least one investment fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmInvestmentFund, com.tools20022.repository.entity.UmbrellaFund.mmSubFund,
						com.tools20022.repository.entity.Country.mmDomiciledFunds, com.tools20022.repository.entity.ContactPoint.mmRelatedInvestmentFund, com.tools20022.repository.entity.InvestmentFundFamily.mmInvestmentFund,
						com.tools20022.repository.entity.InvestmentFundPartyRole.mmInvestmentFund, com.tools20022.repository.entity.TreasuryTradingParty.mmInvestmentFund, com.tools20022.repository.entity.CustodianRole.mmInvestmentFund);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFund.mmDomicileCountry, com.tools20022.repository.entity.InvestmentFund.mmOrderDesk,
						com.tools20022.repository.entity.InvestmentFund.mmInvestmentFundClass, com.tools20022.repository.entity.InvestmentFund.mmFundType, com.tools20022.repository.entity.InvestmentFund.mmTreasuryTradingParty,
						com.tools20022.repository.entity.InvestmentFund.mmIdentification, com.tools20022.repository.entity.InvestmentFund.mmCustodian, com.tools20022.repository.entity.InvestmentFund.mmPartyRole,
						com.tools20022.repository.entity.InvestmentFund.mmFamily, com.tools20022.repository.entity.InvestmentFund.mmStructure, com.tools20022.repository.entity.InvestmentFund.mmLegalForm,
						com.tools20022.repository.entity.InvestmentFund.mmSubFundIndicator, com.tools20022.repository.entity.InvestmentFund.mmEndOfFiscalYear, com.tools20022.repository.entity.InvestmentFund.mmAccountingYearEndDate,
						com.tools20022.repository.entity.InvestmentFund.mmFirstAccountingYearEndDate, com.tools20022.repository.entity.InvestmentFund.mmUmbrellaFund, com.tools20022.repository.entity.InvestmentFund.mmAuthorisedCountry);
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvestmentFund.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Country getDomicileCountry() {
		return domicileCountry;
	}

	public InvestmentFund setDomicileCountry(com.tools20022.repository.entity.Country domicileCountry) {
		this.domicileCountry = Objects.requireNonNull(domicileCountry);
		return this;
	}

	public List<ContactPoint> getOrderDesk() {
		return orderDesk == null ? orderDesk = new ArrayList<>() : orderDesk;
	}

	public InvestmentFund setOrderDesk(List<com.tools20022.repository.entity.ContactPoint> orderDesk) {
		this.orderDesk = Objects.requireNonNull(orderDesk);
		return this;
	}

	public List<InvestmentFundClass> getInvestmentFundClass() {
		return investmentFundClass == null ? investmentFundClass = new ArrayList<>() : investmentFundClass;
	}

	public InvestmentFund setInvestmentFundClass(List<com.tools20022.repository.entity.InvestmentFundClass> investmentFundClass) {
		this.investmentFundClass = Objects.requireNonNull(investmentFundClass);
		return this;
	}

	public Max35Text getFundType() {
		return fundType;
	}

	public InvestmentFund setFundType(Max35Text fundType) {
		this.fundType = Objects.requireNonNull(fundType);
		return this;
	}

	public TreasuryTradingParty getTreasuryTradingParty() {
		return treasuryTradingParty;
	}

	public InvestmentFund setTreasuryTradingParty(com.tools20022.repository.entity.TreasuryTradingParty treasuryTradingParty) {
		this.treasuryTradingParty = Objects.requireNonNull(treasuryTradingParty);
		return this;
	}

	public BICNonFIIdentifier getIdentification() {
		return identification;
	}

	public InvestmentFund setIdentification(BICNonFIIdentifier identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public List<CustodianRole> getCustodian() {
		return custodian == null ? custodian = new ArrayList<>() : custodian;
	}

	public InvestmentFund setCustodian(List<com.tools20022.repository.entity.CustodianRole> custodian) {
		this.custodian = Objects.requireNonNull(custodian);
		return this;
	}

	public List<InvestmentFundPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public InvestmentFund setPartyRole(List<com.tools20022.repository.entity.InvestmentFundPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public Optional<InvestmentFundFamily> getFamily() {
		return family == null ? Optional.empty() : Optional.of(family);
	}

	public InvestmentFund setFamily(com.tools20022.repository.entity.InvestmentFundFamily family) {
		this.family = family;
		return this;
	}

	public FundStructureCode getStructure() {
		return structure;
	}

	public InvestmentFund setStructure(FundStructureCode structure) {
		this.structure = Objects.requireNonNull(structure);
		return this;
	}

	public FundLegalFormCode getLegalForm() {
		return legalForm;
	}

	public InvestmentFund setLegalForm(FundLegalFormCode legalForm) {
		this.legalForm = Objects.requireNonNull(legalForm);
		return this;
	}

	public YesNoIndicator getSubFundIndicator() {
		return subFundIndicator;
	}

	public InvestmentFund setSubFundIndicator(YesNoIndicator subFundIndicator) {
		this.subFundIndicator = Objects.requireNonNull(subFundIndicator);
		return this;
	}

	public ISODate getEndOfFiscalYear() {
		return endOfFiscalYear;
	}

	public InvestmentFund setEndOfFiscalYear(ISODate endOfFiscalYear) {
		this.endOfFiscalYear = Objects.requireNonNull(endOfFiscalYear);
		return this;
	}

	public ISODate getAccountingYearEndDate() {
		return accountingYearEndDate;
	}

	public InvestmentFund setAccountingYearEndDate(ISODate accountingYearEndDate) {
		this.accountingYearEndDate = Objects.requireNonNull(accountingYearEndDate);
		return this;
	}

	public ISODate getFirstAccountingYearEndDate() {
		return firstAccountingYearEndDate;
	}

	public InvestmentFund setFirstAccountingYearEndDate(ISODate firstAccountingYearEndDate) {
		this.firstAccountingYearEndDate = Objects.requireNonNull(firstAccountingYearEndDate);
		return this;
	}

	public Optional<UmbrellaFund> getUmbrellaFund() {
		return umbrellaFund == null ? Optional.empty() : Optional.of(umbrellaFund);
	}

	public InvestmentFund setUmbrellaFund(com.tools20022.repository.entity.UmbrellaFund umbrellaFund) {
		this.umbrellaFund = umbrellaFund;
		return this;
	}

	public CountryCode getAuthorisedCountry() {
		return authorisedCountry;
	}

	public InvestmentFund setAuthorisedCountry(CountryCode authorisedCountry) {
		this.authorisedCountry = Objects.requireNonNull(authorisedCountry);
		return this;
	}
}