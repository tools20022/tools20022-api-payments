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
import com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode;
import com.tools20022.repository.codeset.InstrumentSubStructureTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Tangible items of value to a business.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Asset" src="doc-files/Asset.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#ExpiryDate
 * Asset.ExpiryDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#MaturityDate
 * Asset.MaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Derivative
 * Asset.Derivative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetValue
 * Asset.AssetValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetClassification
 * Asset.AssetClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#FinancialAssetCategory
 * Asset.FinancialAssetCategory}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#AssetPartyRole
 * Asset.AssetPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Issuance
 * Asset.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Portfolio
 * Asset.Portfolio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentAmount
 * Asset.InvestmentAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentRate
 * Asset.InvestmentRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#EffectiveDate
 * Asset.EffectiveDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#FinancialInstrumentSubStructure
 * Asset.FinancialInstrumentSubStructure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#InvestmentPlan
 * Asset.InvestmentPlan}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Trade Asset.Trade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Asset#Tranche Asset.Tranche}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#LegAdditionalInformation
 * Asset.LegAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Asset#StandingSettlementInstruction
 * Asset.StandingSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#Asset Trade.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentPlan#Asset
 * InvestmentPlan.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Portfolio#AssetDescription
 * Portfolio.AssetDescription}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#Asset
 * AssetHolding.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetPartyRole#Asset
 * AssetPartyRole.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetClassification#Asset
 * AssetClassification.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#UnderlyingAsset
 * Derivative.UnderlyingAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#IssuedAsset
 * Issuance.IssuedAsset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Asset
 * StandingSettlementInstruction.Asset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Leg#RelatedAsset
 * Leg.RelatedAsset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tranche#Asset Tranche.Asset}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Money Money}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LetterOfCredit
 * LetterOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Guarantee Guarantee}</li>
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
 * "Asset"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tangible items of value to a business."</li>
 * </ul>
 */
public class Asset {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which an order, a privilege, an entitlement or an offer
	 * terminates. For an interest bearing asset, it is the date/time at which
	 * it becomes due and has to be repaid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExpiryDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExpiryDate";
			definition = "Date on which an order, a privilege, an entitlement or an offer terminates. For an interest bearing asset, it is the date/time at which it becomes due and has to be repaid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Planned date, at the time of issuance, on which an interest bearing
	 * financial instrument becomes due and principal is repaid by the issuer to
	 * the investor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#MaturityDate
	 * CashCollateral5.MaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#ExpectedDate
	 * LoanContractTranche1.ExpectedDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LoanContractTranche1#DueDate
	 * LoanContractTranche1.DueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#MaturityDate
	 * LoanContract1.MaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaturityDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashCollateral5.MaturityDate, com.tools20022.repository.msg.LoanContractTranche1.ExpectedDate, com.tools20022.repository.msg.LoanContractTranche1.DueDate,
					com.tools20022.repository.msg.LoanContract1.MaturityDate);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaturityDate";
			definition = "Planned date, at the time of issuance, on which an interest bearing financial instrument becomes due and principal is repaid by the issuer to the investor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Specifies the parameters of a derivative instrument based on a specific
	 * asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#UnderlyingAsset
	 * Derivative.UnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters of a derivative instrument based on a specific asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Derivative = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Specifies the parameters of a derivative instrument based on a specific asset.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.UnderlyingAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the different values of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#Asset
	 * AssetHolding.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the different values of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetValue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetValue";
			definition = "Specifies the different values of an asset.";
			minOccurs = 0;
			type_lazy = () -> AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Classification of the asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#Asset
	 * AssetClassification.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetClassification
	 * AssetClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classification of the asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetClassification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetClassification";
			definition = "Classification of the asset.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.AssetClassification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetClassification.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Categorization of financial asset type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAssetTypeCategoryCode
	 * FinancialAssetTypeCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAssetCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Categorization of financial asset type."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialAssetCategory = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialAssetCategory";
			definition = "Categorization of financial asset type.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialAssetTypeCategoryCode.mmObject();
		}
	};
	/**
	 * Party which plays a role for a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetPartyRole#Asset
	 * AssetPartyRole.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetPartyRole
	 * AssetPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which plays a role for a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd AssetPartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AssetPartyRole";
			definition = "Party which plays a role for a specific asset.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetPartyRole.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Details regarding the issuance of an asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#IssuedAsset
	 * Issuance.IssuedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details regarding the issuance of an asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Issuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Details regarding the issuance of an asset.";
			minOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.IssuedAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Asset which is part of a portfolio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Portfolio#AssetDescription
	 * Portfolio.AssetDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Portfolio Portfolio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portfolio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset which is part of a portfolio."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Portfolio = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Portfolio";
			definition = "Asset which is part of a portfolio.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Portfolio.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Portfolio.AssetDescription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Invested amount of the portfolio asset.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invested amount of the portfolio asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestmentAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentAmount";
			definition = "Invested amount of the portfolio asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Invested percentage of the portfolio asset.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invested percentage of the portfolio asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InvestmentRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentRate";
			definition = "Invested percentage of the portfolio asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Cut off date/time for the information of the specified portfolio asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cut off date/time for the information of the specified portfolio asset."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EffectiveDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectiveDate";
			definition = "Cut off date/time for the information of the specified portfolio asset.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates the type of deal for structured finance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InstrumentSubStructureTypeCode
	 * InstrumentSubStructureTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentSubStructure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of deal for structured finance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialInstrumentSubStructure = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentSubStructure";
			definition = "Indicates the type of deal for structured finance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> InstrumentSubStructureTypeCode.mmObject();
		}
	};
	/**
	 * Investment plan that invests in a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#Asset
	 * InvestmentPlan.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investment plan that invests in a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InvestmentPlan = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvestmentPlan";
			definition = "Investment plan that invests in a specific asset.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Trade which which involves a specific asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#Asset
	 * Trade.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which which involves a specific asset."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade which which involves a specific asset.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * One of a number of related assets offered as part of the same
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tranche#Asset
	 * Tranche.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tranche Tranche}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LoanContract1#Tranche
	 * LoanContract1.Tranche}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tranche"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of a number of related assets offered as part of the same transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tranche = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LoanContract1.Tranche);
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranche";
			definition = "One of a number of related assets offered as part of the same transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tranche.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tranche.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Provides details about the leg.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Leg#RelatedAsset
	 * Leg.RelatedAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Leg Leg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the leg."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LegAdditionalInformation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LegAdditionalInformation";
			definition = "Provides details about the leg.";
			minOccurs = 0;
			type_lazy = () -> Leg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Leg.RelatedAsset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Standing settlement instruction for which an asset is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction#Asset
	 * StandingSettlementInstruction.Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.StandingSettlementInstruction
	 * StandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Asset
	 * Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Standing settlement instruction for which an asset is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd StandingSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Asset.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			definition = "Standing settlement instruction for which an asset is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.StandingSettlementInstruction.Asset;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Asset";
				definition = "Tangible items of value to a business.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.Asset, com.tools20022.repository.entity.InvestmentPlan.Asset, com.tools20022.repository.entity.Portfolio.AssetDescription,
						com.tools20022.repository.entity.AssetHolding.Asset, com.tools20022.repository.entity.AssetPartyRole.Asset, com.tools20022.repository.entity.AssetClassification.Asset,
						com.tools20022.repository.entity.Derivative.UnderlyingAsset, com.tools20022.repository.entity.Issuance.IssuedAsset, com.tools20022.repository.entity.StandingSettlementInstruction.Asset,
						com.tools20022.repository.entity.Leg.RelatedAsset, com.tools20022.repository.entity.Tranche.Asset);
				subType_lazy = () -> Arrays.asList(Security.mmObject(), com.tools20022.repository.entity.Derivative.mmObject(), Money.mmObject(), LetterOfCredit.mmObject(), Guarantee.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Asset.ExpiryDate, com.tools20022.repository.entity.Asset.MaturityDate, com.tools20022.repository.entity.Asset.Derivative,
						com.tools20022.repository.entity.Asset.AssetValue, com.tools20022.repository.entity.Asset.AssetClassification, com.tools20022.repository.entity.Asset.FinancialAssetCategory,
						com.tools20022.repository.entity.Asset.AssetPartyRole, com.tools20022.repository.entity.Asset.Issuance, com.tools20022.repository.entity.Asset.Portfolio, com.tools20022.repository.entity.Asset.InvestmentAmount,
						com.tools20022.repository.entity.Asset.InvestmentRate, com.tools20022.repository.entity.Asset.EffectiveDate, com.tools20022.repository.entity.Asset.FinancialInstrumentSubStructure,
						com.tools20022.repository.entity.Asset.InvestmentPlan, com.tools20022.repository.entity.Asset.Trade, com.tools20022.repository.entity.Asset.Tranche, com.tools20022.repository.entity.Asset.LegAdditionalInformation,
						com.tools20022.repository.entity.Asset.StandingSettlementInstruction);
			}
		});
		return mmObject_lazy.get();
	}
}