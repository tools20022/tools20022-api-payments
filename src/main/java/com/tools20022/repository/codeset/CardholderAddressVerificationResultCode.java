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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of the cardholder verification address checks on the street number and
 * the postal code from the cardholder's address.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#AddressMatch
 * CardholderAddressVerificationResultCode.AddressMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#AddressNotMatch
 * CardholderAddressVerificationResultCode.AddressNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#AddressTechnical
 * CardholderAddressVerificationResultCode.AddressTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#AddressNotTechnical
 * CardholderAddressVerificationResultCode.AddressNotTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#AddressMissing
 * CardholderAddressVerificationResultCode.AddressMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#AddressNotUsed
 * CardholderAddressVerificationResultCode.AddressNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#PostalMatch
 * CardholderAddressVerificationResultCode.PostalMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#PostalNotMatch
 * CardholderAddressVerificationResultCode.PostalNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#PostalTechnical
 * CardholderAddressVerificationResultCode.PostalTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#PostalNotTechnical
 * CardholderAddressVerificationResultCode.PostalNotTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#PostalMissing
 * CardholderAddressVerificationResultCode.PostalMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode#PostalNotUsed
 * CardholderAddressVerificationResultCode.PostalNotUsed}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AMCH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderAddressVerificationResultCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of the cardholder verification address checks on the street number and the postal code from the cardholder's address."
 * </li>
 * </ul>
 */
public class CardholderAddressVerificationResultCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Address numeric match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address numeric match."</li>
	 * </ul>
	 */
	public static final MMCode AddressMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressMatch";
			definition = "Address numeric match.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "AMCH";
		}
	};
	/**
	 * Address numerics do not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANMH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressNotMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address numerics do not match."</li>
	 * </ul>
	 */
	public static final MMCode AddressNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressNotMatch";
			definition = "Address numerics do not match.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANMH";
		}
	};
	/**
	 * Address numeric not processed for technical reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address numeric not processed for technical reason."</li>
	 * </ul>
	 */
	public static final MMCode AddressTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressTechnical";
			definition = "Address numeric not processed for technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANMT";
		}
	};
	/**
	 * Address numeric not processed for non-technical reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressNotTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address numeric not processed for non-technical reason."</li>
	 * </ul>
	 */
	public static final MMCode AddressNotTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressNotTechnical";
			definition = "Address numeric not processed for non-technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANMO";
		}
	};
	/**
	 * Address numeric missing in request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address numeric missing in request."</li>
	 * </ul>
	 */
	public static final MMCode AddressMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressMissing";
			definition = "Address numeric missing in request.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "AMSS";
		}
	};
	/**
	 * Address numeric not used by issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressNotUsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address numeric not used by issuer."</li>
	 * </ul>
	 */
	public static final MMCode AddressNotUsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AddressNotUsed";
			definition = "Address numeric not used by issuer.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "ANUS";
		}
	};
	/**
	 * Postal code matches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PMCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal code matches."</li>
	 * </ul>
	 */
	public static final MMCode PostalMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalMatch";
			definition = "Postal code matches.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PMCH";
		}
	};
	/**
	 * Postal code does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNMH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalNotMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal code does not match."</li>
	 * </ul>
	 */
	public static final MMCode PostalNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalNotMatch";
			definition = "Postal code does not match.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNMH";
		}
	};
	/**
	 * Postal code not processed for technical reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal code not processed for technical reason."</li>
	 * </ul>
	 */
	public static final MMCode PostalTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalTechnical";
			definition = "Postal code not processed for technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNMT";
		}
	};
	/**
	 * Postal code not processed for non-technical reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalNotTechnical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal code not processed for non-technical reason."</li>
	 * </ul>
	 */
	public static final MMCode PostalNotTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalNotTechnical";
			definition = "Postal code not processed for non-technical reason.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNMO";
		}
	};
	/**
	 * Postal code missing in request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PMSS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal code missing in request."</li>
	 * </ul>
	 */
	public static final MMCode PostalMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalMissing";
			definition = "Postal code missing in request.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PMSS";
		}
	};
	/**
	 * Postal code not used by issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
	 * CardholderAddressVerificationResultCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalNotUsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Postal code not used by issuer."</li>
	 * </ul>
	 */
	public static final MMCode PostalNotUsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalNotUsed";
			definition = "Postal code not used by issuer.";
			owner_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			codeName = "PNUS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AMCH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderAddressVerificationResultCode";
				definition = "Result of the cardholder verification address checks on the street number and the postal code from the cardholder's address.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.AddressNotUsed,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResultCode.PostalNotUsed);
			}
		});
		return mmObject_lazy.get();
	}
}