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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * PIN (Personal Identification Number) format used to encrypt the PIN block.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmISO0
 * PINFormatCode.mmISO0}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmISO1
 * PINFormatCode.mmISO1}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmISO2
 * PINFormatCode.mmISO2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmISO3
 * PINFormatCode.mmISO3}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmISO4
 * PINFormatCode.mmISO4}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmISO5
 * PINFormatCode.mmISO5}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmANSI0
 * PINFormatCode.mmANSI0}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmBancomat
 * PINFormatCode.mmBancomat}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmBanksys
 * PINFormatCode.mmBanksys}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmDiebold
 * PINFormatCode.mmDiebold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmDieboldCO
 * PINFormatCode.mmDieboldCO}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmECI2
 * PINFormatCode.mmECI2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmECI3
 * PINFormatCode.mmECI3}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmEMVRSA
 * PINFormatCode.mmEMVRSA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmIBM3624
 * PINFormatCode.mmIBM3624}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmVISA2
 * PINFormatCode.mmVISA2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PINFormatCode#mmVISA3
 * PINFormatCode.mmVISA3}</li>
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
 * <li>"ISO0"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PINFormatCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "PIN (Personal Identification Number) format used to encrypt the PIN block."</li>
 * </ul>
 */
public class PINFormatCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * PIN diversified with the card account number, conforming to the standard
	 * ISO 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN diversified with the card account number, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmISO0 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO0";
			definition = "PIN diversified with the card account number, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO0";
		}
	};
	/**
	 * PIN completed with random padding characters, conforming to the standard
	 * ISO 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN completed with random padding characters, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmISO1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO1";
			definition = "PIN completed with random padding characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO1";
		}
	};
	/**
	 * PIN without diversification characters, conforming to the standard ISO
	 * 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN without diversification characters, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmISO2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO2";
			definition = "PIN without diversification characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO2";
		}
	};
	/**
	 * PIN diversified with the card account number and random characters,
	 * conforming to the standard ISO 9564-2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmISO3 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO3";
			definition = "PIN diversified with the card account number and random characters, conforming to the standard ISO 9564-2.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO3";
		}
	};
	/**
	 * PIN format used with AES encryption, conforming to the new ISO SC2
	 * format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "PIN format used with AES encryption, conforming to the new ISO SC2 format."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmISO4 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ISO4";
			definition = "PIN format used with AES encryption, conforming to the new ISO SC2 format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO4";
		}
	};
	/**
	 * Alternative PIN format used with AES encryption, conforming to the new
	 * ISO SC2 format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISO5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISO5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmISO5 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISO5";
			definition = "Alternative PIN format used with AES encryption, conforming to the new ISO SC2 format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ISO5";
		}
	};
	/**
	 * ANSI 0 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ANSI0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ANSI 0 PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmANSI0 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ANSI0";
			definition = "ANSI 0 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ANSI";
		}
	};
	/**
	 * Italian Bancomat PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BNCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bancomat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Italian Bancomat PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmBancomat = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bancomat";
			definition = "Italian Bancomat PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "BNCM";
		}
	};
	/**
	 * Banksys PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BKSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Banksys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Banksys PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmBanksys = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Banksys";
			definition = "Banksys PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "BKSY";
		}
	};
	/**
	 * Diebold PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Diebold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Diebold PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmDiebold = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diebold";
			definition = "Diebold PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "DBLD";
		}
	};
	/**
	 * Diebold CO PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DieboldCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Diebold CO PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmDieboldCO = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DieboldCO";
			definition = "Diebold CO PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "DBLC";
		}
	};
	/**
	 * ECI2 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECI2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECI2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ECI2 PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmECI2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI2";
			definition = "ECI2 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ECI2";
		}
	};
	/**
	 * ECI3 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ECI3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECI3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ECI3 PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmECI3 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ECI3";
			definition = "ECI3 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "ECI3";
		}
	};
	/**
	 * EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key
	 * for the PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMVS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVRSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEMVRSA = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVRSA";
			definition = "EMV ISO2 PIN block format encrypted with the EMV RSA cryptographic key for the PIN.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "EMVS";
		}
	};
	/**
	 * IBM 3624 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IBM3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IBM3624"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "IBM 3624 PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmIBM3624 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IBM3624";
			definition = "IBM 3624 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "IBM3";
		}
	};
	/**
	 * VISA2 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VIS2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VISA2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "VISA2 PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmVISA2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA2";
			definition = "VISA2 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "VIS2";
		}
	};
	/**
	 * VISA3 PIN block format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VIS3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VISA3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "VISA3 PIN block format."</li>
	 * </ul>
	 */
	public static final MMCode mmVISA3 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VISA3";
			definition = "VISA3 PIN block format.";
			owner_lazy = () -> PINFormatCode.mmObject();
			codeName = "VIS3";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ISO0");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PINFormatCode";
				definition = "PIN (Personal Identification Number) format used to encrypt the PIN block.";
				code_lazy = () -> Arrays.asList(PINFormatCode.mmISO0, PINFormatCode.mmISO1, PINFormatCode.mmISO2, PINFormatCode.mmISO3, PINFormatCode.mmISO4, PINFormatCode.mmISO5, PINFormatCode.mmANSI0, PINFormatCode.mmBancomat,
						PINFormatCode.mmBanksys, PINFormatCode.mmDiebold, PINFormatCode.mmDieboldCO, PINFormatCode.mmECI2, PINFormatCode.mmECI3, PINFormatCode.mmEMVRSA, PINFormatCode.mmIBM3624, PINFormatCode.mmVISA2, PINFormatCode.mmVISA3);
			}
		});
		return mmObject_lazy.get();
	}
}