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
import com.tools20022.repository.choice.BenchmarkCurveName4Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification1;
import com.tools20022.repository.msg.SecurityIdentification19;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentifiedSecurity
 * SecuritiesIdentification.mmIdentifiedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
 * SecuritiesIdentification.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRIC
 * SecuritiesIdentification.mmRIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTickerSymbol
 * SecuritiesIdentification.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBloomberg
 * SecuritiesIdentification.mmBloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCTA
 * SecuritiesIdentification.mmCTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCommon
 * SecuritiesIdentification.mmCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmName
 * SecuritiesIdentification.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSEDOL
 * SecuritiesIdentification.mmSEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCUSIP
 * SecuritiesIdentification.mmCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmQUICK
 * SecuritiesIdentification.mmQUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmWertpapier
 * SecuritiesIdentification.mmWertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmDutch
 * SecuritiesIdentification.mmDutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValoren
 * SecuritiesIdentification.mmValoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSicovam
 * SecuritiesIdentification.mmSicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBelgian
 * SecuritiesIdentification.mmBelgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmIdentificationSuffix
 * SecuritiesIdentification.mmIdentificationSuffix}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmGenericIdentification
 * SecuritiesIdentification.mmGenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValidityPeriod
 * SecuritiesIdentification.mmValidityPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmApplicableTradingMarket
 * SecuritiesIdentification.mmApplicableTradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTradingIdentification
 * SecuritiesIdentification.mmTradingIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmIdentification
 * Security.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
 * SecuritiesIdentification.mmPrimeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
 * LocalName.mmRelatedSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
 * TradingMarket.mmListedSecurityTradingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmOtherIdentification
 * SecurityIdentification19.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmDescription
 * SecurityIdentification19.mmDescription}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.Security> identifiedSecurity;
	/**
	 * Security for which an identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmIdentifiedSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedSecurity";
			definition = "Security for which an identification is provided.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected ISINOct2015Identifier securityIdentification;
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
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmISIN
	 * BenchmarkCurveName4Choice.mmISIN}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19#mmISIN
	 * SecurityIdentification19.mmISIN}</li>
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
	public static final MMBusinessAttribute mmSecurityIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BenchmarkCurveName4Choice.mmISIN, SecurityIdentification19.mmISIN);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityIdentification";
			definition = "Identification of a security by an ISIN.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getSecurityIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RICIdentifier rIC;
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
	public static final MMBusinessAttribute mmRIC = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getRIC", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TickerIdentifier tickerSymbol;
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
	public static final MMBusinessAttribute mmTickerSymbol = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getTickerSymbol", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Bloomberg2Identifier bloomberg;
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
	public static final MMBusinessAttribute mmBloomberg = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Bloomberg2Identifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getBloomberg", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ConsolidatedTapeAssociationIdentifier cTA;
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
	public static final MMBusinessAttribute mmCTA = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getCTA", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EuroclearClearstreamIdentifier common;
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
	public static final MMBusinessAttribute mmCommon = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getCommon", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LocalName name;
	/**
	 * Name of the financial instrument in free format text.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmRelatedSecurity
	 * LocalName.mmRelatedSecurity}</li>
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
	public static final MMBusinessAssociationEnd mmName = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LocalName.mmRelatedSecurity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LocalName.mmObject();
		}
	};
	protected SEDOLIdentifier sEDOL;
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
	public static final MMBusinessAttribute mmSEDOL = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getSEDOL", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CUSIPIdentifier cUSIP;
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
	public static final MMBusinessAttribute mmCUSIP = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getCUSIP", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected QUICKIdentifier qUICK;
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
	public static final MMBusinessAttribute mmQUICK = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getQUICK", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected WertpapierIdentifier wertpapier;
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
	public static final MMBusinessAttribute mmWertpapier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getWertpapier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DutchIdentifier dutch;
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
	public static final MMBusinessAttribute mmDutch = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getDutch", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ValorenIdentifier valoren;
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
	public static final MMBusinessAttribute mmValoren = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getValoren", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SicovamIdentifier sicovam;
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
	public static final MMBusinessAttribute mmSicovam = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getSicovam", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BelgianIdentifier belgian;
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
	public static final MMBusinessAttribute mmBelgian = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getBelgian", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identificationSuffix;
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
	 * {@linkplain com.tools20022.repository.msg.OtherIdentification1#mmSuffix
	 * OtherIdentification1.mmSuffix}</li>
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
	public static final MMBusinessAttribute mmIdentificationSuffix = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherIdentification1.mmSuffix);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationSuffix";
			definition = "Identifies the suffix of the security identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getIdentificationSuffix", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected GenericIdentification genericIdentification;
	/**
	 * Proprietary identification of a security assigned by an institution or
	 * organisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSecuritiesIdentification
	 * GenericIdentification.mmRelatedSecuritiesIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmGenericIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod;
	/**
	 * Specifies the period during which an identification is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedSecuritiesIdentification
	 * DateTimePeriod.mmRelatedSecuritiesIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValidityPeriod";
			definition = "Specifies the period during which an identification is valid.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TradingMarket> applicableTradingMarket;
	/**
	 * Market(s) on which the trading identification is used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmListedSecurityTradingIdentification
	 * TradingMarket.mmListedSecurityTradingIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmApplicableTradingMarket = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableTradingMarket";
			definition = "Market(s) on which the trading identification is used.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmListedSecurityTradingIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TradingMarket.mmObject();
		}
	};
	protected SecuritiesIdentification primeIdentification;
	/**
	 * Specifies the main identification of a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRelatedOtherIdentification
	 * SecuritiesIdentification.mmRelatedOtherIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmPrimeIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PrimeIdentification";
			definition = "Specifies the main identification of a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmRelatedOtherIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesIdentification> relatedOtherIdentification;
	/**
	 * Alternate security identification(s) related to the security trading
	 * identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmPrimeIdentification
	 * SecuritiesIdentification.mmPrimeIdentification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedOtherIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOtherIdentification";
			definition = "Alternate security identification(s) related to the security trading identification.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmPrimeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
		}
	};
	protected Max70Text tradingIdentification;
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
	public static final MMBusinessAttribute mmTradingIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradingIdentification";
			definition = "Security identifier specific to a trading market or markets, for example, Ticker.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesIdentification.class.getMethod("getTradingIdentification", new Class[]{});
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
				name = "SecuritiesIdentification";
				definition = "Unique and unambiguous identifier of a security, assigned under a formal or proprietary identification scheme.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmIdentification, com.tools20022.repository.entity.SecuritiesIdentification.mmPrimeIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmRelatedOtherIdentification, com.tools20022.repository.entity.GenericIdentification.mmRelatedSecuritiesIdentification,
						com.tools20022.repository.entity.LocalName.mmRelatedSecurity, com.tools20022.repository.entity.TradingMarket.mmListedSecurityTradingIdentification,
						com.tools20022.repository.entity.DateTimePeriod.mmRelatedSecuritiesIdentification);
				derivationElement_lazy = () -> Arrays.asList(SecurityIdentification19.mmOtherIdentification, SecurityIdentification19.mmDescription);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesIdentification.mmIdentifiedSecurity, com.tools20022.repository.entity.SecuritiesIdentification.mmSecurityIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmRIC, com.tools20022.repository.entity.SecuritiesIdentification.mmTickerSymbol, com.tools20022.repository.entity.SecuritiesIdentification.mmBloomberg,
						com.tools20022.repository.entity.SecuritiesIdentification.mmCTA, com.tools20022.repository.entity.SecuritiesIdentification.mmCommon, com.tools20022.repository.entity.SecuritiesIdentification.mmName,
						com.tools20022.repository.entity.SecuritiesIdentification.mmSEDOL, com.tools20022.repository.entity.SecuritiesIdentification.mmCUSIP, com.tools20022.repository.entity.SecuritiesIdentification.mmQUICK,
						com.tools20022.repository.entity.SecuritiesIdentification.mmWertpapier, com.tools20022.repository.entity.SecuritiesIdentification.mmDutch, com.tools20022.repository.entity.SecuritiesIdentification.mmValoren,
						com.tools20022.repository.entity.SecuritiesIdentification.mmSicovam, com.tools20022.repository.entity.SecuritiesIdentification.mmBelgian,
						com.tools20022.repository.entity.SecuritiesIdentification.mmIdentificationSuffix, com.tools20022.repository.entity.SecuritiesIdentification.mmGenericIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmValidityPeriod, com.tools20022.repository.entity.SecuritiesIdentification.mmApplicableTradingMarket,
						com.tools20022.repository.entity.SecuritiesIdentification.mmPrimeIdentification, com.tools20022.repository.entity.SecuritiesIdentification.mmRelatedOtherIdentification,
						com.tools20022.repository.entity.SecuritiesIdentification.mmTradingIdentification);
				derivationComponent_lazy = () -> Arrays.asList(OtherIdentification1.mmObject(), SecurityIdentification19.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Security> getIdentifiedSecurity() {
		return identifiedSecurity;
	}

	public void setIdentifiedSecurity(List<com.tools20022.repository.entity.Security> identifiedSecurity) {
		this.identifiedSecurity = identifiedSecurity;
	}

	public ISINOct2015Identifier getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(ISINOct2015Identifier securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	public RICIdentifier getRIC() {
		return rIC;
	}

	public void setRIC(RICIdentifier rIC) {
		this.rIC = rIC;
	}

	public TickerIdentifier getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(TickerIdentifier tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public Bloomberg2Identifier getBloomberg() {
		return bloomberg;
	}

	public void setBloomberg(Bloomberg2Identifier bloomberg) {
		this.bloomberg = bloomberg;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return cTA;
	}

	public void setCTA(ConsolidatedTapeAssociationIdentifier cTA) {
		this.cTA = cTA;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return common;
	}

	public void setCommon(EuroclearClearstreamIdentifier common) {
		this.common = common;
	}

	public LocalName getName() {
		return name;
	}

	public void setName(com.tools20022.repository.entity.LocalName name) {
		this.name = name;
	}

	public SEDOLIdentifier getSEDOL() {
		return sEDOL;
	}

	public void setSEDOL(SEDOLIdentifier sEDOL) {
		this.sEDOL = sEDOL;
	}

	public CUSIPIdentifier getCUSIP() {
		return cUSIP;
	}

	public void setCUSIP(CUSIPIdentifier cUSIP) {
		this.cUSIP = cUSIP;
	}

	public QUICKIdentifier getQUICK() {
		return qUICK;
	}

	public void setQUICK(QUICKIdentifier qUICK) {
		this.qUICK = qUICK;
	}

	public WertpapierIdentifier getWertpapier() {
		return wertpapier;
	}

	public void setWertpapier(WertpapierIdentifier wertpapier) {
		this.wertpapier = wertpapier;
	}

	public DutchIdentifier getDutch() {
		return dutch;
	}

	public void setDutch(DutchIdentifier dutch) {
		this.dutch = dutch;
	}

	public ValorenIdentifier getValoren() {
		return valoren;
	}

	public void setValoren(ValorenIdentifier valoren) {
		this.valoren = valoren;
	}

	public SicovamIdentifier getSicovam() {
		return sicovam;
	}

	public void setSicovam(SicovamIdentifier sicovam) {
		this.sicovam = sicovam;
	}

	public BelgianIdentifier getBelgian() {
		return belgian;
	}

	public void setBelgian(BelgianIdentifier belgian) {
		this.belgian = belgian;
	}

	public Max35Text getIdentificationSuffix() {
		return identificationSuffix;
	}

	public void setIdentificationSuffix(Max35Text identificationSuffix) {
		this.identificationSuffix = identificationSuffix;
	}

	public GenericIdentification getGenericIdentification() {
		return genericIdentification;
	}

	public void setGenericIdentification(com.tools20022.repository.entity.GenericIdentification genericIdentification) {
		this.genericIdentification = genericIdentification;
	}

	public List<DateTimePeriod> getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(List<com.tools20022.repository.entity.DateTimePeriod> validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public List<TradingMarket> getApplicableTradingMarket() {
		return applicableTradingMarket;
	}

	public void setApplicableTradingMarket(List<com.tools20022.repository.entity.TradingMarket> applicableTradingMarket) {
		this.applicableTradingMarket = applicableTradingMarket;
	}

	public SecuritiesIdentification getPrimeIdentification() {
		return primeIdentification;
	}

	public void setPrimeIdentification(com.tools20022.repository.entity.SecuritiesIdentification primeIdentification) {
		this.primeIdentification = primeIdentification;
	}

	public List<SecuritiesIdentification> getRelatedOtherIdentification() {
		return relatedOtherIdentification;
	}

	public void setRelatedOtherIdentification(List<com.tools20022.repository.entity.SecuritiesIdentification> relatedOtherIdentification) {
		this.relatedOtherIdentification = relatedOtherIdentification;
	}

	public Max70Text getTradingIdentification() {
		return tradingIdentification;
	}

	public void setTradingIdentification(Max70Text tradingIdentification) {
		this.tradingIdentification = tradingIdentification;
	}
}