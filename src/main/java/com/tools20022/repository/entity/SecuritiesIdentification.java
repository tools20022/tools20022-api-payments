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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.msg.OtherIdentification1;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unique and unambiguous identifier of a security, assigned under a formal or
 * proprietary identification scheme.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesIdentification"
 * src="doc-files/SecuritiesIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentifiedSecurity
 * SecuritiesIdentification.IdentifiedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#SecurityIdentification
 * SecuritiesIdentification.SecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RIC
 * SecuritiesIdentification.RIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#TickerSymbol
 * SecuritiesIdentification.TickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Bloomberg
 * SecuritiesIdentification.Bloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#CTA
 * SecuritiesIdentification.CTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Common
 * SecuritiesIdentification.Common}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Name
 * SecuritiesIdentification.Name}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#SEDOL
 * SecuritiesIdentification.SEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#CUSIP
 * SecuritiesIdentification.CUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#QUICK
 * SecuritiesIdentification.QUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Wertpapier
 * SecuritiesIdentification.Wertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Dutch
 * SecuritiesIdentification.Dutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Valoren
 * SecuritiesIdentification.Valoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Sicovam
 * SecuritiesIdentification.Sicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#Belgian
 * SecuritiesIdentification.Belgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#IdentificationSuffix
 * SecuritiesIdentification.IdentificationSuffix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#GenericIdentification
 * SecuritiesIdentification.GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ValidityPeriod
 * SecuritiesIdentification.ValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#ApplicableTradingMarket
 * SecuritiesIdentification.ApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#PrimeIdentification
 * SecuritiesIdentification.PrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RelatedOtherIdentification
 * SecuritiesIdentification.RelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#TradingIdentification
 * SecuritiesIdentification.TradingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Identification
 * Security.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#PrimeIdentification
 * SecuritiesIdentification.PrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RelatedOtherIdentification
 * SecuritiesIdentification.RelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSecuritiesIdentification
 * GenericIdentification.RelatedSecuritiesIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#RelatedSecurity
 * LocalName.RelatedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurityTradingIdentification
 * TradingMarket.ListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesIdentification
 * DateTimePeriod.RelatedSecuritiesIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#OtherIdentification
 * SecurityIdentification19.OtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#Description
 * SecurityIdentification19.Description}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OtherIdentification1
 * OtherIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityIdentification19
 * SecurityIdentification19}</li>
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
 * "SecuritiesIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme."
 * </li>
 * </ul>
 */
public class SecuritiesIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Security for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Identification
	 * Security.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which an identification is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd IdentifiedSecurity = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedSecurity";
			definition = "Security for which an identification is provided.";
			minOccurs = 1;
			type_lazy = () -> Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Identification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a security by an ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#ISIN
	 * BenchmarkCurveName4Choice.ISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#ISIN
	 * SecurityIdentification19.ISIN}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a security by an ISIN."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SecurityIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BenchmarkCurveName4Choice.ISIN, com.tools20022.repository.msg.SecurityIdentification19.ISIN);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	/**
	 * Reuters Identification Code (RIC). A numbering system used within the
	 * Reuters system to identify instruments worldwide. The RIC contains an
	 * X-character market specific code (can be the CUSIP or EPIC codes)
	 * followed by a full stop, then the two-digit ISO country code, eg, IBM in
	 * UK is IBM.UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RICIdentifier
	 * RICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RIC = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}
	};
	/**
	 * Letters that identify a stock traded on a stock exchange. The Ticker
	 * Symbol is a short and convenient way of identifying a stock, eg, RTR.L
	 * for Reuters quoted in London.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TickerIdentifier
	 * TickerIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TickerSymbol = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}
	};
	/**
	 * Identifier of a security assigned by the Bloomberg organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Bloomberg2Identifier
	 * Bloomberg2Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bloomberg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Bloomberg organisation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Bloomberg = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Bloomberg2Identifier.mmObject();
		}
	};
	/**
	 * Identifier of a security assigned by the Consolidated Tape Association.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ConsolidatedTapeAssociationIdentifier
	 * ConsolidatedTapeAssociationIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Consolidated Tape Association."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CTA = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}
	};
	/**
	 * Identifier of securities issued in Luxembourg. The common code is a
	 * 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroclearClearstreamIdentifier
	 * EuroclearClearstreamIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Common"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Common = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}
	};
	/**
	 * Name of the financial instrument in free format text.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#RelatedSecurity
	 * LocalName.RelatedSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LocalName LocalName}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Name = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LocalName.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LocalName.RelatedSecurity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Stock Exchange Daily Official List (SEDOL) number. A code used by the
	 * London Stock Exchange to identify foreign stocks, especially those that
	 * aren't actively traded in the US and don't have a CUSIP number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SEDOLIdentifier
	 * SEDOLIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SEDOL = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}
	};
	/**
	 * Committee on Uniform Securities and Identification Procedures (CUSIP).
	 * The standards body that created and maintains the securities
	 * classification system in the US. The CUSIP is composed of a 9-character
	 * number that uniquely identifies a particular security. Non-US securities
	 * have a similar number called the CINS number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CUSIPIdentifier
	 * CUSIPIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CUSIP = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}
	};
	/**
	 * Identifier of a security assigned by the Japanese QUICK identification
	 * scheme for financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.QUICKIdentifier
	 * QUICKIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QUICK = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}
	};
	/**
	 * Wertpapier Kenn-nummer. A number issued in Germany by the Wertpapier
	 * Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains
	 * 6-digits, but no check digit. There are different ranges of numbers
	 * representing different classes of securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.WertpapierIdentifier
	 * WertpapierIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wertpapier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Wertpapier = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for Dutch securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DutchIdentifier
	 * DutchIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dutch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Dutch securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Dutch = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for Swiss securities assigned by Telekurs Financial, the Swiss
	 * numbering agency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ValorenIdentifier
	 * ValorenIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valoren"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Valoren = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for French securities assigned by the Societe
	 * Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in
	 * France. The Sicovam is composed of 5-digits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SicovamIdentifier
	 * SicovamIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sicovam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Sicovam = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}
	};
	/**
	 * Identifier for Belgian securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BelgianIdentifier
	 * BelgianIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Belgian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Belgian securities."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Belgian = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
		}
	};
	/**
	 * Identifies the suffix of the security identification.
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
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#Suffix
	 * OtherIdentification1.Suffix}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the suffix of the security identification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IdentificationSuffix = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OtherIdentification1.Suffix);
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationSuffix";
			definition = "Identifies the suffix of the security identification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Proprietary identification of a security assigned by an institution or
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSecuritiesIdentification
	 * GenericIdentification.RelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GenericIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedSecuritiesIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the period during which an identification is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedSecuritiesIdentification
	 * DateTimePeriod.RelatedSecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period during which an identification is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ValidityPeriod = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Market(s) on which the trading identification is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#ListedSecurityTradingIdentification
	 * TradingMarket.ListedSecurityTradingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TradingMarket
	 * TradingMarket}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableTradingMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market(s) on which the trading identification is used."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ApplicableTradingMarket = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableTradingMarket";
			definition = "Market(s) on which the trading identification is used.";
			minOccurs = 0;
			type_lazy = () -> TradingMarket.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.ListedSecurityTradingIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the main identification of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#RelatedOtherIdentification
	 * SecuritiesIdentification.RelatedOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the main identification of a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PrimeIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PrimeIdentification";
			definition = "Specifies the main identification of a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.RelatedOtherIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Alternate security identification(s) related to the security trading
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#PrimeIdentification
	 * SecuritiesIdentification.PrimeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternate security identification(s) related to the security trading identification."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedOtherIdentification = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedOtherIdentification";
			definition = "Alternate security identification(s) related to the security trading identification.";
			minOccurs = 1;
			type_lazy = () -> SecuritiesIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.PrimeIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Security identifier specific to a trading market or markets, for example,
	 * Ticker.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security identifier specific to a trading market or markets, for example, Ticker."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TradingIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradingIdentification";
			definition = "Security identifier specific to a trading market or markets, for example, Ticker.";
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
				name = "SecuritiesIdentification";
				definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Identification, com.tools20022.repository.entity.SecuritiesIdentification.PrimeIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.RelatedOtherIdentification, com.tools20022.repository.entity.GenericIdentification.RelatedSecuritiesIdentification,
						com.tools20022.repository.entity.LocalName.RelatedSecurity, com.tools20022.repository.entity.TradingMarket.ListedSecurityTradingIdentification,
						com.tools20022.repository.entity.DateTimePeriod.RelatedSecuritiesIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification19.OtherIdentification, com.tools20022.repository.msg.SecurityIdentification19.Description);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.IdentifiedSecurity, com.tools20022.repository.entity.SecuritiesIdentification.SecurityIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.RIC, com.tools20022.repository.entity.SecuritiesIdentification.TickerSymbol, com.tools20022.repository.entity.SecuritiesIdentification.Bloomberg,
						com.tools20022.repository.entity.SecuritiesIdentification.CTA, com.tools20022.repository.entity.SecuritiesIdentification.Common, com.tools20022.repository.entity.SecuritiesIdentification.Name,
						com.tools20022.repository.entity.SecuritiesIdentification.SEDOL, com.tools20022.repository.entity.SecuritiesIdentification.CUSIP, com.tools20022.repository.entity.SecuritiesIdentification.QUICK,
						com.tools20022.repository.entity.SecuritiesIdentification.Wertpapier, com.tools20022.repository.entity.SecuritiesIdentification.Dutch, com.tools20022.repository.entity.SecuritiesIdentification.Valoren,
						com.tools20022.repository.entity.SecuritiesIdentification.Sicovam, com.tools20022.repository.entity.SecuritiesIdentification.Belgian, com.tools20022.repository.entity.SecuritiesIdentification.IdentificationSuffix,
						com.tools20022.repository.entity.SecuritiesIdentification.GenericIdentification, com.tools20022.repository.entity.SecuritiesIdentification.ValidityPeriod,
						com.tools20022.repository.entity.SecuritiesIdentification.ApplicableTradingMarket, com.tools20022.repository.entity.SecuritiesIdentification.PrimeIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.RelatedOtherIdentification, com.tools20022.repository.entity.SecuritiesIdentification.TradingIdentification);
				derivationComponent_lazy = () -> Arrays.asList(OtherIdentification1.mmObject(), SecurityIdentification19.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}