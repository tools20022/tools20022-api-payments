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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.QuoteStatusCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the status of a quote acknowledgement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatusCode#Accepted
 * QuoteStatusCode.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#CancelSymbol
 * QuoteStatusCode.mmCancelSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#CancelSecurity
 * QuoteStatusCode.mmCancelSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#CancelUnderlying
 * QuoteStatusCode.mmCancelUnderlying}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatusCode#CancelAll
 * QuoteStatusCode.mmCancelAll}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatusCode#Rejected
 * QuoteStatusCode.mmRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#RemovedFromMarket
 * QuoteStatusCode.mmRemovedFromMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatusCode#Expired
 * QuoteStatusCode.mmExpired}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatusCode#Query
 * QuoteStatusCode.mmQuery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#QuoteNotFound
 * QuoteStatusCode.mmQuoteNotFound}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatusCode#Pending
 * QuoteStatusCode.mmPending}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.QuoteStatusCode#Pass
 * QuoteStatusCode.mmPass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#LockedMarketWarning
 * QuoteStatusCode.mmLockedMarketWarning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#CrossMarketWarning
 * QuoteStatusCode.mmCrossMarketWarning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#CanceledDueToLockMarket
 * QuoteStatusCode.mmCanceledDueToLockMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode#CanceledDueToCrossMarket
 * QuoteStatusCode.mmCanceledDueToCrossMarket}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACPT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuoteStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the status of a quote acknowledgement."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class QuoteStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the quote is accepted for further negotiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote is accepted for further negotiation."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode Accepted = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Indicates that the quote is accepted for further negotiation.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Indicates that all quotes are cancelled for a financial instrument's
	 * symbol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYMB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that all quotes are cancelled for a financial instrument's symbol."
	 * </li>
	 * </ul>
	 */
	public static final QuoteStatusCode CancelSymbol = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSymbol";
			definition = "Indicates that all quotes are cancelled for a financial instrument's symbol.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "SYMB";
		}
	};
	/**
	 * Indicates that all quotes are cancelled for a specific security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that all quotes are cancelled for a specific security."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode CancelSecurity = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelSecurity";
			definition = "Indicates that all quotes are cancelled for a specific security.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "SECU";
		}
	};
	/**
	 * Indicates that all quotes are cancelled for an underlying financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUnderlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that all quotes are cancelled for an underlying financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final QuoteStatusCode CancelUnderlying = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUnderlying";
			definition = "Indicates that all quotes are cancelled for an underlying financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "UNSY";
		}
	};
	/**
	 * Indicates that all quotes are cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelAll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that all quotes are cancelled."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode CancelAll = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelAll";
			definition = "Indicates that all quotes are cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "ALLE";
		}
	};
	/**
	 * Indicates that the quote is not accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the quote is not accepted."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode Rejected = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Indicates that the quote is not accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Indicates that all quotes are removed from the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemovedFromMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that all quotes are removed from the market."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode RemovedFromMarket = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemovedFromMarket";
			definition = "Indicates that all quotes are removed from the market.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "REMO";
		}
	};
	/**
	 * Indicates that the quote is not valid anymore.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the quote is not valid anymore."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode Expired = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Indicates that the quote is not valid anymore.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Indicates that the quote is being requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Query"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the quote is being requested."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode Query = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Query";
			definition = "Indicates that the quote is being requested.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "QUER";
		}
	};
	/**
	 * Indicates that no quote can be computed or communicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NQUO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that no quote can be computed or communicated."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode QuoteNotFound = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteNotFound";
			definition = "Indicates that no quote can be computed or communicated.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "NQUO";
		}
	};
	/**
	 * Indicates that the quote is being processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the quote is being processed."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode Pending = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Indicates that the quote is being processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Indicates that the counterparty is not interested in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the counterparty is not interested in the transaction."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode Pass = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			definition = "Indicates that the counterparty is not interested in the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Warning due to a situation of locked market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LMWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LockedMarketWarning"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warning due to a situation of locked market."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode LockedMarketWarning = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LockedMarketWarning";
			definition = "Warning due to a situation of locked market.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "LMWA";
		}
	};
	/**
	 * Warning due to a situation of cross market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossMarketWarning"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warning due to a situation of cross market."</li>
	 * </ul>
	 */
	public static final QuoteStatusCode CrossMarketWarning = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossMarketWarning";
			definition = "Warning due to a situation of cross market.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "CMWA";
		}
	};
	/**
	 * Indicates that the quote is canceled due to a situation of locked market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDLM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanceledDueToLockMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote is canceled due to a situation of locked market."
	 * </li>
	 * </ul>
	 */
	public static final QuoteStatusCode CanceledDueToLockMarket = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanceledDueToLockMarket";
			definition = "Indicates that the quote is canceled due to a situation of locked market.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "CDLM";
		}
	};
	/**
	 * Indicates that the quote is canceled due to a situation of cross market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.QuoteStatusCode
	 * QuoteStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CanceledDueToCrossMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the quote is canceled due to a situation of cross market."
	 * </li>
	 * </ul>
	 */
	public static final QuoteStatusCode CanceledDueToCrossMarket = new QuoteStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CanceledDueToCrossMarket";
			definition = "Indicates that the quote is canceled due to a situation of cross market.";
			owner_lazy = () -> com.tools20022.repository.codeset.QuoteStatusCode.mmObject();
			codeName = "CDCM";
		}
	};
	final static private LinkedHashMap<String, QuoteStatusCode> codesByName = new LinkedHashMap<>();

	protected QuoteStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACPT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuoteStatusCode";
				definition = "Identifies the status of a quote acknowledgement.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.QuoteStatusCode.Accepted, com.tools20022.repository.codeset.QuoteStatusCode.CancelSymbol, com.tools20022.repository.codeset.QuoteStatusCode.CancelSecurity,
						com.tools20022.repository.codeset.QuoteStatusCode.CancelUnderlying, com.tools20022.repository.codeset.QuoteStatusCode.CancelAll, com.tools20022.repository.codeset.QuoteStatusCode.Rejected,
						com.tools20022.repository.codeset.QuoteStatusCode.RemovedFromMarket, com.tools20022.repository.codeset.QuoteStatusCode.Expired, com.tools20022.repository.codeset.QuoteStatusCode.Query,
						com.tools20022.repository.codeset.QuoteStatusCode.QuoteNotFound, com.tools20022.repository.codeset.QuoteStatusCode.Pending, com.tools20022.repository.codeset.QuoteStatusCode.Pass,
						com.tools20022.repository.codeset.QuoteStatusCode.LockedMarketWarning, com.tools20022.repository.codeset.QuoteStatusCode.CrossMarketWarning, com.tools20022.repository.codeset.QuoteStatusCode.CanceledDueToLockMarket,
						com.tools20022.repository.codeset.QuoteStatusCode.CanceledDueToCrossMarket);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(CancelSymbol.getCodeName().get(), CancelSymbol);
		codesByName.put(CancelSecurity.getCodeName().get(), CancelSecurity);
		codesByName.put(CancelUnderlying.getCodeName().get(), CancelUnderlying);
		codesByName.put(CancelAll.getCodeName().get(), CancelAll);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(RemovedFromMarket.getCodeName().get(), RemovedFromMarket);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(Query.getCodeName().get(), Query);
		codesByName.put(QuoteNotFound.getCodeName().get(), QuoteNotFound);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Pass.getCodeName().get(), Pass);
		codesByName.put(LockedMarketWarning.getCodeName().get(), LockedMarketWarning);
		codesByName.put(CrossMarketWarning.getCodeName().get(), CrossMarketWarning);
		codesByName.put(CanceledDueToLockMarket.getCodeName().get(), CanceledDueToLockMarket);
		codesByName.put(CanceledDueToCrossMarket.getCodeName().get(), CanceledDueToCrossMarket);
	}

	public static QuoteStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static QuoteStatusCode[] values() {
		QuoteStatusCode[] values = new QuoteStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, QuoteStatusCode> {
		@Override
		public QuoteStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(QuoteStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}